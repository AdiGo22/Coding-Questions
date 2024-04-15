/*This is daily leetcode starting from March 2024. So today question is  - SubArray Product less than k    Leetcode No.- 713    */
public class March27{
   public static int Solution(int[]nums , int k) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        int prod = 1;
        int count = 0;
          if(k<=1) return 0;
        while(right < n) {
            prod*=nums[right]; //{10}
              
               while(prod >= k) {
                  //remove the left and squeeze the window by shifting the left pointer.
                    prod/=nums[left];
                    left++;
               }
             
            //and thus the number of n is the window length.
             //keep incrementing the right pointer to increase the pointer
             count+=(right-left)+1;
             right++;
      }
      
      return count;
   } 
   public static void main(String[] args) {
    int[]nums = new int[]{10,5,2,6};
    int k = 100;
    System.out.println(Solution(nums, k));
   }
}
