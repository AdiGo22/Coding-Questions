/*This is daily leetcode starting from March 2024. So today question is  - Product of Array Except Self   Leetcode No.- 238      */
class March15 {
    public static int[] productExceptSelf(int[] nums) {
    int[] left = new int[nums.length];
    int[] right = new int[nums.length];

    left[0] = 1;
    right[nums.length-1] =1;  //left --> ---------->
                              //right <------------
    int[]output = new int[nums.length];
    for(int i=1;i<left.length;i++) {
        left[i] = left[i-1] * nums[i-1];
    }

    for(int i=nums.length-2;i>=0;i--) {
        right[i] = right[i+1] * nums[i+1];
    }

    for(int i=0;i<output.length;i++) {
        output[i] = left[i] * right[i];
    }

    return output;
}
public static void main(String[] args) {
    int[] nums = new int[] {1,2,3,4};
    System.out.println(productExceptSelf(nums));
} 
}