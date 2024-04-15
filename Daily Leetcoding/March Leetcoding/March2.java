/*This is daily leetcode starting from March 2024. So today question is  - Squares of sorted array. Leetcode No.- 977*/
import java.util.*;
public class March2 {
    public static int[] SquaredArray (int[]nums) {
        /* return an array of the squares of each number sorted in non-decreasing order. */
        //brute force
        int[] squared = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            squared[i] =  nums[i]*nums[i] ;
        }

        //lets sort the array squared
        Arrays.sort(squared);
    
    return squared;
}
public static void main(String[] args) {
    int[]nums = new int[]{-1,-3,-5,6};
    System.out.println(SquaredArray(nums));
}
}

