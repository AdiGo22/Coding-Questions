package BackTracking;
import java.util.*;
public class LetterCombinations2 {
    public static List<String> combinations( String digits) {
        List<String> res = new ArrayList<>();

    //edge case
    if(digits.length() == 0) return res; //return the empty list
     
    HashMap<String , String> map = new HashMap<>();
    map.put("2","abc"); map.put("3","def"); map.put("4","ghi"); map.put("5","jkl");
    map.put("6","mno"); map.put("7","pqrs"); map.put("8","tuv"); map.put("9","wxyz");

    Deque<String> deque = new ArrayDeque<>();
    deque.add("") ; //pass the empty string first 

    for(int i=0;i<digits.length();i++) {
         String number  = digits.substring(i,i+1); //slice and extract the number
         String Letter = map.get(number) ; //extract the corresponding letter of the number dialed
         int n = deque.size() ;
               //loop till the length of deque (to poll the first from the deque)
               for(int j=0;j<n;j++){
                 String ExtractLetter = deque.pollFirst();
                   //now merge the Extracted letter with the digits of the other corresponding number dialed
                    for(int k=0;k<Letter.length();k++){
                        String temp = ExtractLetter.concat(Letter.charAt(k)+""); //temp - polled element merged with the other letters of number
                        deque.add(temp); //add temp inside the deque;
                    }
               }
    }//keep the process repeating till it reaches digit.length()

    while(!deque.isEmpty()) {
        res.add(deque.poll()); //empty the deque inside the list
    }
         return res;

    }

    public static void main(String[] args) {
        String digits = "23";
        System.out.println(combinations(digits));
    }
}