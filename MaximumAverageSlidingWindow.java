public class MaximumAverageSlidingWindow {
    public static double max(int[]nums, int k){
        double average =0;

        //calculate the avg of first k
        for(int i=0;i<k;i++){
            average+=nums[i]/1.0/k; //converted for double
        }

        double maxAverage = average;

        for(int i=0;i<nums.length-k;i++){
            int j = i+k; //window stretch

            average-=nums[i]/1.0/k; //removing the contribution of first element thereby mmoving the window
            average+=nums[j]/1.0/k; //adding the newly got element 

            if(average> maxAverage){
                maxAverage = average;
            }
        }
        return maxAverage;
    }

    public static void main(String args []){
         int[] nums = new int[]{1,12,-5,-6,50,3};
         int k = 4;
         System.out.println(max(nums,k));
    }
}
