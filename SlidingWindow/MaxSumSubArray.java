package SlidingWindow;

public class MaxSumSubArray {
    public static int MaximumSub (int[]nums , int k){
        int Sum =0;
        for(int i=0;i<k;i++){
           Sum+=nums[i]; //initial window declared
        }
        int MaxSum = Sum;
        for(int i=0;i<nums.length-k;i++){
            int j = i+k;
            Sum-=nums[i]; //remove the latter exisiting
            Sum+=nums[j]; //add the next upcoming
            //window is automatically slided with i and j as first and last pointers of window.
             
            if(Sum > MaxSum){
                MaxSum = Sum;
            }

        }

        return MaxSum; //return the value of Maximum Sum obtained
    }

    public static void main(String[] args) {
        int[] nums = new int [] {1,5,-2,3,4,11,-7};
        int k = 3;
        System.out.println(MaximumSub(nums, k));
    }
}
