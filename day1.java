import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        String original = scanner.nextLine();
        
        // Remove all spaces and convert to lowercase for accurate comparison
        String cleaned = original.replaceAll("\\s+", "").toLowerCase();
        
        // Check for palindrome using two pointers
        boolean isPalindrome = true;
        int left = 0;
        int right = cleaned.length() - 1;
        
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        
        if (isPalindrome) {
            System.out.println("\"" + original + "\" is a palindrome!");
        } else {
            System.out.println("\"" + original + "\" is not a palindrome.");
        }
        
        scanner.close();
    }
}
