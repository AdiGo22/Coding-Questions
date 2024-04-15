import java.util.*;
public class AlikeStringHalves2 {
    public static boolean returnifalike(String s){
        //convert all of em to lower case
        s = s.toLowerCase();
        int vowelA = 0 , vowelB = 0;
        
       //optimised solution-1 

       //HashSet of vowels
       HashSet<Character> vowels = new HashSet<>();
       vowels.add('a');
       vowels.add('e');
       vowels.add('i');
       vowels.add('o');
       vowels.add('u');

       int start = 0 , end = s.length()-1;
       while(start<=end){
        if(vowels.contains(s.charAt(start))){
          vowelA++;
          start++;
        }else{
            start++;
        }

        if(vowels.contains(s.charAt(end))){
            vowelB++;
            end--;
          }else{
              end--;
          }
       }

       return vowelA==vowelB;
    }
    public static void main(String[] args) {
        String s = "book";
        System.out.println(returnifalike(s));
    }
}
       
       








