public class CountSpaces {
    public static void main(String[] args) {
        String quote = "The only way to do great work is to love what you do.";  // You can change this to your favorite quote
        int spaceCount = 0;

        // Count spaces in the quote
        for (int i = 0; i < quote.length(); i++) {
            if (quote.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        // Display the result
        System.out.println("Quote: \"" + quote + "\"");
        System.out.println("Total number of spaces: " + spaceCount);
    }
}
