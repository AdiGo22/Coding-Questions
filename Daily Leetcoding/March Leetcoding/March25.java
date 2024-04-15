/*This is daily leetcode starting from March 2024. So today question is  - Find All Duplicates in Array    Leetcode No.- 442     */
import java.util.*;

public class March25 {
    public static List<Integer> findDuplicates (int[]nums) {
       //hashmap and enter all the nums[i] and list containing all the duplicates.

       HashMap<Integer,Integer> map = new HashMap<>();
       List<Integer> duplicates = new ArrayList<>();

       for(int i:nums){
        map.put(i,map.getOrDefault(i, 0)+1); //freq mapped inside the hashmap.
       }
       
       //collect all the numbers that are appearing twice.
       for(Map.Entry<Integer,Integer>entry : map.entrySet()) {
         int key = entry.getKey();
         int val = entry.getValue();

         if(val ==2) {
            duplicates.add(key);
         }
       }
       return duplicates;
    }
    public static void main(String[] args) {
      int[]nums = new int[]{1,1,2};
      System.out.println(findDuplicates(nums));
    }
}
