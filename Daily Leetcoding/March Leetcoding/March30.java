import java.util.*;

public class March30 {
  public static int SlidingWindow (int[] nums , int k) {
    int i =0;
    int j =0;
    int n = nums.length;
    int count = 0;
  
    Map<Integer,Integer> map = new HashMap<>();
    while(j<n){
        map.put(nums[j] , map.getOrDefault(nums[j], 0)+1);
          //exceeds
            while(map.size() > k) {
                map.put(nums[i], map.get(nums[i])-1);
                   if(map.get(nums[i]) == 0){
                    map.remove(nums[i]); 
                   }
                   i++;
            }
            count+=(j-i+1);
            j++;
    }
    return count;
  }
public static int SubArraysWithKDifferentInteger(int[] nums ,int k) {
    return SlidingWindow(nums, k) - SlidingWindow(nums, k-1); //recursively subtract till k reaches 1 
 }
 public static void main(String[] args) {
    int[] nums = new int[] {1,2,1,2,3};
    int k = 2;
    System.out.println(SubArraysWithKDifferentInteger(nums, k));
 }
}