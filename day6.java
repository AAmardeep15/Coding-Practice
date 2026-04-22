import java.util.Scanner;

public class day6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string to reverse: ");
        String originalStr = scanner.nextLine();
        
        // Using StringBuilder to reverse the string
        StringBuilder reversedStr = new StringBuilder(originalStr);
        reversedStr.reverse();
        
        System.out.println("Original String: " + originalStr);
        System.out.println("Reversed String: " + reversedStr.toString());
        
        scanner.close();
    }
}
