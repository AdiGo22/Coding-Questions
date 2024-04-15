package BackTracking;

import java.util.*;

import javax.print.DocFlavor.STRING;

public class LetterCombinations {

    void TelephoneCombinations(int indx , String digits, )
    public static List<String> combinations(String digits){ 
        int length = digits.length() ; //length of digit entered
        if(length ==0) return null;
        HashMap <Character,String> telephone = new HashMap<>();
        //add corresponding letters to telephone
        ArrayList<String> result = new ArrayList<>();

        telephone.put('2',"abc");
        telephone.put('3',"def");
        telephone.put('4',"ghi");
        telephone.put('5',"jkl");
        telephone.put('6',"mno");
        telephone.put('7',"pqrs");
        telephone.put('8',"tuv");
        telephone.put('9',"wxyz");

        String temp = "";
        TelephoneCombinations(0,digits,temp,telephone);

        return result;
    }

    
      