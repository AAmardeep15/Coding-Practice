import java.util.Scanner;

public class day021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string or number to check for palindrome: ");
        String input = scanner.nextLine();
        
        // Remove spaces and convert to lowercase for a more robust check 
        // (optional, but good for phrases like "Race car")
        String cleanInput = input.replaceAll("\\s+", "").toLowerCase();
        
        // Method 1: Using StringBuilder (Easy and concise)
        boolean isPalMethod1 = isPalindromeUsingBuilder(cleanInput);
        System.out.println("Using StringBuilder: Is it a palindrome? " + isPalMethod1);
        
        // Method 2: Using Two Pointers (More efficient, no extra string memory)
        boolean isPalMethod2 = isPalindromeUsingTwoPointers(cleanInput);
        System.out.println("Using Two Pointers: Is it a palindrome? " + isPalMethod2);
        
        scanner.close();
    }
    
    // Method 1: Reverses the string and compares it to the original
    public static boolean isPalindromeUsingBuilder(String str) {
        StringBuilder reversedStr = new StringBuilder(str).reverse();
        return str.equals(reversedStr.toString());
    }
    
    // Method 2: Compares characters from the outside moving towards the center
    public static boolean isPalindromeUsingTwoPointers(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Mismatch found
            }
            left++;
            right--;
        }
        return true; // No mismatches found
    }
}
