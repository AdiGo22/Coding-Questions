import java.util.Scanner;

public class camelcase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        scanner.close();

        printCamelCaseWords(inputString);
    }

    public static void printCamelCaseWords(String inputString) {
        String currentWord = "";
        int length = inputString.length();

        for (int i = 0; i < length; i++) {
            char currentChar = inputString.charAt(i);

            if (Character.isUpperCase(currentChar)) {
                if (!currentWord.isEmpty()) {
                    System.out.println(currentWord);
                    currentWord = ""; // Clear the current word
                }
            }

            currentWord += currentChar;
        }

        // Print the last word (if any)
        if (!currentWord.isEmpty()) {
            System.out.println(currentWord);
        }
    }
}


