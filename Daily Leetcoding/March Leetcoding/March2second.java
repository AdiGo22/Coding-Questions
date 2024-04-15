public class March2second {
    public static int[] squared (int[]nums) {
        int n = nums.length;
        int[] result = new int[nums.length];
        int i = 0, j=n-1, k =n-1;

        while(k>=0) {
            int a = nums[i]*nums[i];
            int b = nums[j]*nums[j];

            if(a > b) {
              result[k] = a;
              i++;
           }else{
            result[k] =  b;
            j--;
           }
            k--;
        }
        return result;
    }

    public static void main(String[] args) {
        int[]nums = new int[]{-1,-3,-5,0};
        System.out.println(squared(nums));
    }
}