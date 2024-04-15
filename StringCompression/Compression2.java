package StringCompression;

public class Compression2 {
    /* s = "aaabbcccaadef"
     * compression 2 = a3b2c3a2def
     */

    public static int compress(String s) {
        char ch[] = s.toCharArray();
        char Compressed = ch[0];
        String CompressedSt = Compressed + "";
        int i = 1;
        int count = 1;

        while (i < s.length()) {
            if (Compressed == ch[i]) {
                count++;
                i++;
            } else {
                if (count > 1) {
                    CompressedSt += Integer.toString(count);
                }
                Compressed = ch[i];
                CompressedSt += Compressed;
                count = 1;
                i++;
            }
        }
        
        // Add the count of the last character if it's greater than 1.
        if (count > 1) {
            CompressedSt += Integer.toString(count);
        }

        return CompressedSt.length();
    }

    public static void main(String[] args) {
        String s = "abbbbbbbbbbbb";
        System.out.println(compress(s));
    }
}
