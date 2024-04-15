/*This is daily leetcode starting from March 2024. So today question is  -Contigious Array   Leetcode No.- 525     */
import java.util.*;
class March16 {
    public static int FindMaxLength (int[] nums) {
        //return the longest subarray with equal number of 0 and 1 , length in a binary array.
        
        /*approach - replace 0 with -1  and enter them into a hashmap with currSum and index ,
         * such that if the same currSum is seen again then we had sum 0 somewhere before this index. 
         * Thus for repetition of same index - length = i-index+1 
         */
         int n  = nums.length;
         HashMap<Integer,Integer> map = new HashMap<>();
         int currSum = 0;
         int MaxLen = 0;

         map.put(0,-1); //initially  - map.put(currSum , index)
         for(int i=0;i<n;i++) {
            //if nums[i] = 1, currSum = 1 else -1 for 0
           currSum+= (nums[i] == 1) ? 1 : -1; 

           //if map contains the same currSum 
           if(map.containsKey(currSum)) {
            //record the maximum length by going just before it.
            MaxLen = Math.max(MaxLen,i-map.get(currSum));
           }else{
            //else if not found enter currSum and i index in the map
            map.put(currSum ,i);
           }
         }

         //finally return the maxLen

         return MaxLen;
        }
        
        public static void main(String[] args) {
            int[] nums = new int[]{0,1,0};
            System.out.println(FindMaxLength(nums));
        }
    }