package SlidingWindow;

import java.util.ArrayList;

public class MaximumSubArrays {
    public static ArrayList<Integer> maximum(int[] nums , int k){
        ArrayList<Integer> maximum = new ArrayList<>();
        int max =0;
        for(int i=0;i<k;i++){
        max = Math.max(max,nums[i]);
        }
        maximum.add(max);
        //slide the window

        for(int i=0;i<nums.length-k;i++){
            int j = i+k;
            //how to slide this window to include jth and exlude the ith
        }
    }
}
