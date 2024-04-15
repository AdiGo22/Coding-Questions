package SlidingWindow;
import java.util.*;
public class CountAnagrams2 {
    public static int count (String s, String p){
      HashMap<Character, Integer> map = new HashMap<>();
      for(int i=0;i<p.length();i++){
          if(map.containsKey(p.charAt(i))){
            map.put(p.charAt(i),map.get(p.charAt(i))+1);
          }else{
            map.put(p.charAt(i),1);
          }
      }//entered into map the freq of p
      int check =p.length();int count =0;
      for(int i=0;i<s.length();i++){
        if(map.containsKey(s.charAt(i))){
             //map.put(p.charAt(i),map.get(p.charAt(i))-1); 
             check--;
        }
          if(check == 0){
          count++;
          check = p.length();
          i+=
          } //all the characters of p found in s - one anagram achieved
      }

    }
}
