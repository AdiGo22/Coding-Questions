import java.util.Arrays;

public class KSumPairs2 {
 
    public int maxOperations(int[] nums, int k) {
    
        //using 2 pointer
        Arrays.sort(nums);
       int start =0;
       int end = nums.length-1;
       int count= 0;
       while(start<end){
           if(nums[start]+ nums[end] == k){
               count++;
               start++;
               end--;
           }else if(nums[start]+ nums[end]< k){
               start++;
           }else end--;
       }
       return count;
    }
}