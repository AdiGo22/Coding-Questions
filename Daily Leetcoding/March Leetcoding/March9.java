/*This is daily leetcode starting from March 2024. So today question is  -Count Elements With Maximum Frequency  Leetcode No.-  3005    */
import java.util.*;
public class March9 {
    public static int MaximumFrequency(int[] nums) {
        //store all the elements in the hashmap and then sum all the maximum frequencies.

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        //find maxValue 
        int max = Collections.max(map.values()); int count  = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue()== max) {
              count+=entry.getValue();
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int []nums = {1,2,3,4,5};
        System.out.println(MaximumFrequency(nums));
    }
}