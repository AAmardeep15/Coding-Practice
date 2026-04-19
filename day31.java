import java.util.Scanner;

public class day31 {

    // Method: Recursive decimal to binary conversion
    static String decimalToBinaryRecursive(int decimal) {
        if (decimal == 0) return "0";
        if (decimal == 1) return "1";
        return decimalToBinaryRecursive(decimal / 2) + (decimal % 2);
    }

    // Method: Using bit shifting (bitwise approach)
    static String decimalToBinaryBitwise(int decimal) {
        if (decimal == 0) return "0";
        StringBuilder binary = new StringBuilder();
        // Find the highest set bit
        for (int i = 31; i >= 0; i--) {
            int bit = (decimal >> i) & 1;
            if (bit == 1 || binary.length() > 0) {
                binary.append(bit);
            }
        }
        return binary.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a non-negative decimal number: ");
        int number = sc.nextInt();

        System.out.println("\n--- Decimal to Binary (Alternate Methods) ---");
        System.out.println("Decimal           : " + number);
        System.out.println("Binary (recursive): " + decimalToBinaryRecursive(number));
        System.out.println("Binary (bitwise)  : " + decimalToBinaryBitwise(number));

        sc.close();
    }
}
