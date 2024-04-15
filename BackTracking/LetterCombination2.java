package BackTracking;
import java.util.*;
public class LetterCombinations2 {
 
    public static List<String> combinations( String digits ) {
        //make  a collection of letters and numbers
        HashMap<Character , String  > telephone  = new HashMap<>() ;
        telephone.put('2' , "abc") ;
        telephone.put('3' , "def") ;
       telephone.put('4' , "ghi") ;
       telephone.put('5' , "jkl") ;
       telephone.put('6' , "mno") ;
       telephone.put('7' , "pqrs") ;
       telephone.put('8' , "tuv") ;
       telephone.put('9' , "wxyz") ;

       //make an ArrayList containing collection of letters

       List<List<String>> res = new ArrayList<>() ;
       String dialedLetter;
       DialNumbers(0 , res , new ArrayList<>(),dialedLetter , digits , telephone);

       return res; //will see it
    }

    static void DialNumbers(int index, List<List<String>> res , List<String>curr , String dialedLetter, String digits , HashMap<Character,String> telephone) {

        for(int i=0;i<digits.length();i++) {
          char ch = digits.charAt(i) ; //2, 3
          curr.add(telephone.get(ch)); // it will call na
        }
        
    }
                

    }
}