public class productexceptself2 {
    public static int[]product(int[]nums){
        //this is the most optimised approach using less space and not using other left right array 
        int[] output = new int[nums.length];
        output[0] =1;
        for(int i=1;i<nums.length;i++){
            output[i] = output[i-1]*nums[i-1];
        }
        int right=1;//initialised
        for(int i=nums.length-1;i>=0;i--){
            output[i] = output[i]*right;
            right = right*nums[i]; //updated right
        }

        return output;
    }
}
