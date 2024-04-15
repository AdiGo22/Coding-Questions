import java.util.*;
public class trialReverseVowels {
    public String reverseVowels(String s){
        int replacementIndex =0;
        //convert all in lower case
        s = s.toLowerCase();
        char[] charArray = s.toCharArray();//converted s to chararray
        String vowels = "AEIOUaeiou";

        // Replace vowels with underscores in the char array
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < charArray.length; i++) {
            if (vowels.indexOf(charArray[i]) != -1) {
                list.add(charArray[i]);
                charArray[i] = '_';
            }
        }//charArray changed
        
       
            for (int i = 0; i < charArray.length; i++) {
                if (charArray[i] == '_') {
                    if (replacementIndex < list.size()) {
                        charArray[i] = list.get(replacementIndex);
                        replacementIndex++;
                    }
                }
            }
    
            return new String(charArray);
        }
    }
   