/*This is daily leetcode starting from March 2024. So today question is  - Find duplicate number   Leetcode No.- 287     */

public class March24 {
    public static int FindDuplicate(int[] nums ) {
        int  n =nums.length;
      

        for(int i =0 ;i<n;i++) {
            int val = Math.abs(nums[i]);
            int indx = val-1;

               if(nums[indx] < 0) {
              return val;
               }

               nums[indx]*=-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = new int[] {3,1,3,4,2};
        System.out.println(FindDuplicate(nums));
    } 
}
