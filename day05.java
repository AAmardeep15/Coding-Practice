public class day05 {
    public static void main(String[] args) {
        String input = "Hello, World! I am practicing Java.";
        System.out.println("Original String: " + input);

        // Method 1: Using StringBuilder (The most efficient and standard way in Java)
        String reversedWithBuilder = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed (using StringBuilder): " + reversedWithBuilder);

        // Method 2: Using a manual loop (To demonstrate the algorithm)
        char[] characters = input.toCharArray();
        String reversedManual = "";
        
        for (int i = characters.length - 1; i >= 0; i--) {
            reversedManual += characters[i];
        }
        System.out.println("Reversed (manual loop): " + reversedManual);
    }
}
