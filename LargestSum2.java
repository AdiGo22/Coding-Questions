public class LargestSum2 {
    public static int largest(int[]nums){
          int maxSum =nums[0], currentSum = 0;
        for(int i=0;i<nums.length;i++){
            currentSum += nums[i];
            maxSum = Math.max(currentSum,maxSum);

            if(currentSum<0){
                currentSum =0;
            }
        }
         return maxSum;

    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(largest(nums));
    }
}
