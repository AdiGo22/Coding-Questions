/*This is daily leetcode starting from March 2024. So today question is  - length of Longest Subarray with at most K frequency  Leetcode No.- 2958  */
import java.util.*;  
public class March28 {
    public static int MaxLen (int[] nums , int k) {
  //{1,2,3,1,2,3,1,2}
   //typical Sliding window problem
   int i = 0 ;
   int j = 0;
   int result = 0;
   int n = nums.length;
    
   Map<Integer,Integer> map = new HashMap<>();
   while (j < n) {
    map.put(nums[j] , map.getOrDefault(nums[j],0)+1); //entered into map
       //to shrink the window with i pointer.
          while(map.getOrDefault(nums[j],0) > k  && i<j ) {
              //shrink the window
              map.put(nums[i],map.get(nums[i])-1); 
                 //and if it reaches the end while shrinking.
                   if(map.get(nums[i])== 0) {
                       map.remove(nums[i]); //remove.
                   }
                   i++; //shift the window.
          }

        result = Math.max(result,j-i+1);
        j++;
     }
    return result;
}


public static void main(String[] args) {
    int[] nums = new int[]{1,2,3,1,2,3,1,2};
    int k = 2;
    System.out.println(MaxLen(nums, k));
}
}