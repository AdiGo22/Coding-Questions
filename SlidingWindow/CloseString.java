package SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CloseString {
    //maintain the count of each character in a string 
    //maintain the character in each string
   public static boolean closer(String word1 , String word2){
    HashMap<Character,Integer> map1 = new HashMap<>(); //map for word1
    HashMap<Character,Integer> map2 = new HashMap<>(); //map for word2
    boolean flag;
    
    for(int  i =0;i<word1.length();i++){
      if(map1.containsKey(word1.charAt(i))){
        map1.put(word1.charAt(i) , map1.get(word1.charAt(i))+1);
      }else{
        map1.put(word1.charAt(i),1 );
      }
    }//store the characters of word1 

    for(int  i =0;i<word2.length();i++){
      if(map2.containsKey(word2.charAt(i))){
        map2.put(word2.charAt(i) , map2.get(word2.charAt(i))+1);
      }else{
        map2.put(word2.charAt(i),1 );
      }
    }//store the characters of word2
    
    if(map1.equals(map2)){
       flag = true;
    }else{
        flag = false;
    }

    return flag;
}

//sort and store in the arraylist
List<Integer> word1list = new ArrayList<Integer>();
List<Integer> word2list = new ArrayList<>();
for(int i=0;i<word1.length();i++){
 word1list.add(map1.get()
}

public static void main(String[] args) {
    String word1 = "cabbba";
    String word2 = "abbccc"; 
    System.out.println(closer(word1, word2));
}
}