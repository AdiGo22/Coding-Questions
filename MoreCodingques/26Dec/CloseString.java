import java.util.*;
public class CloseString {
    public static boolean ifStringClose(String word1, String word2){
        //ALREADY AN OPTIMISED SOLUTION AS BRUTE IS DONE

    
                // Get the lengths of the two words
                int n = word1.length();
                int m = word2.length();
        
                // If the lengths are different, the words cannot be close
                if (m != n) {
                    return false;
                }
        
                // Arrays to store the frequency of each character in the words
                int[] freq1 = new int[26];
                int[] freq2 = new int[26];
        
                // Populate the frequency arrays based on characters in the words
                for (int i = 0; i < m; i++) {
                    char ch1 = word1.charAt(i);
                    char ch2 = word2.charAt(i);
        
                    freq1[ch1 - 'a']++;  // Increment the count for the character in word1
                    freq2[ch2 - 'a']++;  // Increment the count for the character in word2
                }
        
                // Check if the characters and their frequencies are the same in both words
                for (int i = 0; i < 26; i++) {
                    if ((freq1[i] != 0 && freq2[i] != 0) || (freq1[i] == 0 && freq2[i] == 0)) {
                        continue;  // Characters and their frequencies match or both are zero
                    }
        
                    // If characters or their frequencies differ, the words are not close
                    return false;
                }
        
                // Sort the frequency arrays
                Arrays.sort(freq1);
                Arrays.sort(freq2);
        
                // Check if the sorted frequency arrays are equal
                return Arrays.equals(freq1, freq2);
            }
        
        
public static void main(String[] args) {
    String word1 = "abc";
    String word2 = "bca";
    System.out.println(ifStringClose(word1, word2));
}

}