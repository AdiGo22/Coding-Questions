public class ReverseString {
    //method 1
    public String reverse(String s) {
        String finalString = "";
        String[] spStrings = s.split(" ");

        for (int i = spStrings.length - 1; i >= 0; i--) {
            finalString += spStrings[i];
            if (i > 0) {
                finalString += " "; // Add a space between words, except for the last word
            }
        }
        return finalString.trim().replaceAll("//s+"," ");
    }
}
