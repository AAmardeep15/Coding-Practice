import java.util.Scanner;

public class day10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = scanner.nextLine();
        

        if (input == null || input.trim().isEmpty()) {
            System.out.println("Number of words: 0");
        } else {
            String[] words = input.trim().split("\\s+");
            System.out.println("Number of words (strings) in the inputt: " + words.length);
        }
        scanner.close();
    }
}
