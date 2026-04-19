import java.util.Scanner;

public class day3 {
    // Method 1: Manual conversion using repeated division
    static String decimalToBinary(int decimal) {
        if (decimal == 0) return "0";

        StringBuilder binary = new StringBuilder();
        int n = Math.abs(decimal);

        while (n > 0) {
            binary.insert(0, n % 2);  // prepend remainder
            n /= 2;
        }

        return (decimal < 0 ? "-" : "") + binary.toString();
    }

    // Method 2: Using Java's built-in Integer.toBinaryString()
    static String decimalToBinaryBuiltIn(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int number = sc.nextInt();

        System.out.println("\n--- Decimal to Binary Conversion ---");
        System.out.println("Decimal        : " + number);
        System.out.println("Binary (manual): " + decimalToBinary(number));
        System.out.println("Binary (built-in): " + decimalToBinaryBuiltIn(number));

        sc.close();
    }
}
