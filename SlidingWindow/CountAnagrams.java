package SlidingWindow;
 import java.util.*;
public class CountAnagrams {
    public static int Count(String s , String p){
        HashMap<Character,Integer> map = new HashMap<>();
         for(int i=0;i<p.length();i++){
           if(map.containsKey(p.charAt(i))){
            map.put(p.charAt(i) , map.get(p.charAt(i))+1);
           }else{
            map.put(p.charAt(i) , 1);
           }
         } //entered frequencies

         ArrayList<Character> anagram = new ArrayList<>();
        int check = 0; int count =0; 
         for(int i =0;i<p.length();i++){
            anagram.add(p.charAt(i));
            if(map.containsKey(anagram.get(i))){
                map.put(anagram.get(i), map.get(anagram.get(i))-1);
                check++;
            }
            if(check == p.length()){
              count++;
            }
         }

         //move the window 

         for(int i=0;i<s.length() - p.length();i++){
            int j = i+p.length();
            
            if (map.containsKey(anagram.get(i))) {
                map.put(anagram.get(i), map.get(anagram.get(i)) + 1);
                if (map.get(anagram.get(i)) > 0) {
                    check--;
                }
            } 

            anagram.remove(0); // Remove the leftmost character from the window.
            anagram.add(s.charAt(j));

            if (map.containsKey(anagram.get(p.length() - 1))) {
                map.put(anagram.get(p.length() - 1), map.get(anagram.get(p.length() - 1)) - 1);
                if (map.get(anagram.get(p.length() - 1)) >= 0) {
                    check++;
                }
            }

            if (check == p.length()) {
                count++;
            }
        }

        return count;
    }
       public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc"; 
        System.out.println(Count(s, p));
       }
    }