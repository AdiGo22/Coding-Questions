/*This is daily leetcode starting from March 2024. So today question is  -Binary Subarrays With Sum     Leetcode No.- 930    */
public class March14 {
    public static int subArrayswithSum(int[] nums, int goal) {
        int count = 0;
        
        for(int i = 0; i < nums.length; i++) {
            int preSum = 0; // Reset prefix sum for each starting index
            for(int j = i; j < nums.length; j++) {
                preSum += nums[j]; // Add current element to prefix sum
                if(preSum == goal) {
                    count++; // Increment count if prefix sum equals goal
                }
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {0, 0, 0, 0, 0};
        int goal = 0;
        System.out.println(subArrayswithSum(nums, goal)); // Output should be 15
    }
}
