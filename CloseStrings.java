import java.util.*;

public class CloseStrings {
    public static boolean close (String word1 , String word2){

        //edge case
        if(word1.length()!= word2.length()){
            return false;
        }
        
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();

        for(char c: word1.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }

        for(char c: word2.toCharArray()){
            map2.put(c,map2.getOrDefault(c,0)+1);
        }

        if(!map1.keySet().equals(map2.keySet())){
            return false ; //if it does not matches
        }
        
        List<Integer>Word1Frequency = new ArrayList<>(map1.values());
        List<Integer>Word2Frequency = new ArrayList<>(map2.values());

        Collections.sort(Word1Frequency);
        Collections.sort(Word2Frequency);

        return Word1Frequency.equals(Word2Frequency);
    }

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "bca";
        System.out.println(close(word1,word2));
    }
}
        