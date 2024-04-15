package BinarySearch;

import java.util.Arrays;


class Solution {
    public static int findPeakElement(int[] nums) {
       int[] SortedNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(SortedNums); //sort the array 
        int PeakNumber = SortedNums[SortedNums.length-1]; 

        int index =0;
        for(int i=0;i<nums.length;i++){
            if(PeakNumber  == nums[i]){
                index = i;
       }
        }
              return index;
    }
public static void main(String[] args) {
    int[]nums = new int[]{1,2,3,1};
    System.out.println(findPeakElement(nums));
}
}