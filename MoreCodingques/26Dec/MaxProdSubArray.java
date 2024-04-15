public class MaxProdSubArray {
    public static int MaximumProd(int[] nums) {
         //nums - {2,3,-2,4}
        //brute force - nested loop and find max prod
    
      int maxprod = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
              int prod = 1; // reinitialise very important
            for(int j=i;j<nums.length;j++){
                prod*=nums[j];
                maxprod = Math.max(maxprod,prod);
            }
        }

        return maxprod;
    }

    public static void main(String[] args) {
        int[]nums = new int[]{0,2};
        System.out.println(MaximumProd(nums));
    }
}