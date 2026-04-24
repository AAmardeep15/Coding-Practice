import java.util.Scanner;

public class day8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Please enter a positive integer.");
            } else {
                int firstTerm = 0, secondTerm = 1;
                System.out.println("Fibonacci Series up to " + n + " terms:");

                for (int i = 1; i <= n; ++i) {
                    System.out.print(firstTerm + " ");

                    // compute the next term
                    int nextTerm = firstTerm + secondTerm;
                    firstTerm = secondTerm;
                    secondTerm = nextTerm;
                }
                System.out.println(); // For a clean new line at the end
            }
        } else {
            System.out.println("Invalid input. Please enter a positive integer.");
        }
        
        scanner.close();
    }
}
