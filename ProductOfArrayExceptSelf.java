public class ProductOfArrayExceptSelf {
    public int[] product (int[]nums){
        int [] output = new int[nums.length];
        output[0] =1;
        //left

        for(int i=1;i<nums.length;i++){
            output[i] = nums[i-1] * output[i-1];
        }

        int right =1;
        for(int i = nums.length-1;i>=0;i--){
            output[i] = output[i] * right;
            right*=nums[i];
        }
        return output;
    }
}
