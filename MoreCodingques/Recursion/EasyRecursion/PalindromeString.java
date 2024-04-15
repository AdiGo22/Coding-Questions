package Recursion.EasyRecursion;

public class PalindromeString {
    public static String checkIfPalindrome(String word, int len) {
        if (len > 0) {
            char rightChar = word.charAt(len - 1);
            char leftChar = word.charAt(word.length() - len);

            if (rightChar == leftChar) {
                // Continue checking the remaining characters
                return checkIfPalindrome(word, len - 1);
            } else {
                return "No";
            }
        } else {
            return "Yes";
        }
    }

    public static void main(String[] args) {
        String word = "malayalam";
        int len = word.length();
        System.out.println(checkIfPalindrome(word, len));
    }
}
