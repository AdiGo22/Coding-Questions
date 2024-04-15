/*This is daily leetcode starting from March 2024. So today question is  - Count SubArrays with max elemnt appears at least k times  Leetcode No.- 2962     */
import java.util.*;
public class March29second {
    public static long CountSubarrays (int[] nums , int k ) {
        //second approach
        List<Integer> maxIndices = new ArrayList<>();
        long result = 0;
        int n = nums.length;
        int maxE = 0;
        for(int i = 0;i<n;i++) {
         maxE = Math.max(maxE , nums[i]);
        }//found the max element from the nums.

        for(int i =0;i<n;i++) {
            if(nums[i] == maxE){
                maxIndices.add(i);

                int size = maxIndices.size();
                 if(size>=k) {
                    //if it exceeds find the last index
                    int lastIndex = maxIndices.get(size-k);
                    result+=lastIndex+1;
                 }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums =  new int[] {1,3,2,3,3};
        int k = 2;
        System.out.println(CountSubarrays(nums,k));
    }
}
