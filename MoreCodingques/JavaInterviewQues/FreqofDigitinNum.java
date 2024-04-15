package JavaInterviewQues;

public class FreqofDigitinNum {
    public static int Freq(int n, int d) {
        // Convert the integer to a string
        String N = Integer.toString(n);

        // Convert the digit to a character
        char D = (char) (d + '0');

        // Initialize frequency counter
        int freq = 0;

        // Iterate through the characters of the string
        for (int i = 0; i < N.length(); i++) {
            // Check if the current character is equal to the digit character
            if (N.charAt(i) == D) {
                freq++;
            }
        }

        return freq;
    }

    public static void main(String[] args) {
        int n = 4545444;
        int d = 4;
        System.out.println(Freq(n, d));
    }
}
