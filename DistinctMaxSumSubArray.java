import java.util.*;
public class DistinctMaxSumSubArray {
    public static int maxSumDistinctSubarray(int[] nums, int k) {
        int maxSum = 0;
        int left = 0;
        HashSet<Integer> set = new HashSet();

        for (int right = 0; right < nums.length; right++) {
            while (set.contains(nums[right]) || right - left >= k) {
                set.remove(nums[left]);
                left++;
            }
            set.add(nums[right]);

            if (right - left + 1 == k) {
                int sum = 0;
                for (int i = left; i <= right; i++) {
                    sum += nums[i];
                }
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 5, 4, 2, 9, 9, 11};
        int k = 3;
        System.out.println(maxSumDistinctSubarray(nums, k)); // Output: 17
    }
}
