/*This is daily leetcode starting from March 2024. So today question is  -Minimum Common Value    Leetcode No.-  2540    */

import java.util.*;

public class March8 {
    public static  int getCommon (int[] nums1 , int[]nums2) {
        //1.the arrays are sorted in inc order
        //return the minimum common value between both the arrays. 

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums1) {
            map.put(i,map.getOrDefault(i, 0)+1); //entered the elements of nums1 into map.
        }
               int MinCommon = Integer.MAX_VALUE;
        for(int i:nums2) {
           if(map.containsKey(i)) {
             //now get the minimum from the common.
                  return MinCommon = Math.min(MinCommon,i);
           }
        }
        //get the least common in MinCommon
        return -1;
    }
    public static void main(String[] args) {
        int[]nums1 = new int[]{1,2,3,6};
        int[]nums2 = new int[]{2,3,4,5};
        System.out.println(getCommon(nums1,nums2));
    }
}
