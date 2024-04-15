import java.util.*;

public class MinStepsAnagram {
    public static int MinimumSteps (String s , String t) {
        // feed all characters of s and t in a hashmap
        int result = 0;
        if(s.length() != t.length()){
            return 0;
        }

        HashMap<Character , Integer > mapS = new HashMap<>();
        HashMap<Character , Integer > mapT = new HashMap<>();


        for(int i=0;i<s.length();i++){
            mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i),0)+1); //inserted all characters in mapS
        }

        for(int i=0;i<s.length();i++){
            mapT.put(t.charAt(i),mapT.getOrDefault(t.charAt(i),0)+1); //inserted all charaCTERS In mapT
        }
         
        //To check from t
       for(char ch : mapS.keySet()) {
        int freqT =mapT.getOrDefault(ch, 0);
        int freqS = mapS.get(ch);
       

       if(freqT < freqS) {
        result +=freqS-freqT;
       }
    }

    return result;
}

public static void main(String[] args) {
    String s = "leetcode";
    String t = "practice";

    System.out.println(MinimumSteps(s, t));
}
}