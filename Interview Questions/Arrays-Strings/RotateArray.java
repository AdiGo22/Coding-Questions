import java.util.*;
//leetcode 189
public class RotateArray {
    public static int[] rotate(int[] nums, int k) {
        k = k % nums.length;//important
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        return nums; // Return the rotated array
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(); // Number of steps
        int n = sc.nextInt(); // Size of nums
        int[] arr = new int[n]; // Array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] rotatedArray = rotate(arr, k); // Rotate the array

        // Print the rotated array
        System.out.println("Rotated Array:");
        for (int num : rotatedArray) {
            System.out.print(num + " ");
        }
    }
}

      