import java.util.Scanner;

public class day02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();
        
        try {
            // Method 1: Using the built-in Integer.parseInt method
            int decimalFormatBuiltIn = Integer.parseInt(binaryString, 2);
            System.out.println("Decimal representation (using built-in method): " + decimalFormatBuiltIn);
            
            // Method 2: Custom algorithmic approach
            int decimalFormatCustom = convertBinaryToDecimal(binaryString);
            System.out.println("Decimal representation (using custom method): " + decimalFormatCustom);
            
        } catch (NumberFormatException e) {
            System.out.println("Invalid binary number. Make sure it only contains 0s and 1s.");
        }
        
        scanner.close();
    }
    
    // Custom method to convert a binary string to a decimal integer
    public static int convertBinaryToDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();
        
        for (int i = 0; i < length; i++) {
            char digit = binary.charAt(i);
            if (digit == '1') {
                // Determine the power of 2 based on the position from the right
                int power = length - 1 - i;
                decimal += Math.pow(2, power);
            } else if (digit != '0') {
                throw new NumberFormatException("Invalid binary digit");
            }
        }
        return decimal;
    }
}
