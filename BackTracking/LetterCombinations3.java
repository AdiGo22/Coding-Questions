package BackTracking;
import java.util.*;


public class LetterCombinations3 {
    public static List<String> LetterCombinations (String digits) {
        LinkedList <String> output_arr = new LinkedList<>();
        if(digits.length()==0) return output_arr; //edge case
        output_arr.add(""); //pass empty string

        String[] charArray = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        for(int i=0;i<digits.length();i++){
            int index = Character.getNumericValue(digits.charAt(i)); //store index as individual entries in a string digit
              while(output_arr.peek().length()==i) {
                String permutations = output_arr.remove(); 
                for(char c: charArray[index].toCharArray()){
                    output_arr.add(permutations+c);
                }
              }
        }

        return output_arr;

    }

    public static void main(String[] args) {
        String digits = "23";
        System.out.println(LetterCombinations(digits));
    }
}
