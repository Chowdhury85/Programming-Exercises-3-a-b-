import java.util.Scanner;

public class CountSpaces2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a quote
        System.out.print("Enter your favorite quote: ");
        String userQuote = input.nextLine();
        int spaceCount = 0;

        // Count spaces in the input
        for (int i = 0; i < userQuote.length(); i++) {
            if (userQuote.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        // Display the result
        System.out.println("Total number of spaces: " + spaceCount);

        input.close();
    }
}
