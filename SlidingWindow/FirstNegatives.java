package SlidingWindow;

import java.util.ArrayList;

public class FirstNegatives {
    public static ArrayList<Integer> findFirstNegative(int[] nums, int k) {
        ArrayList<Integer> FirstNegative = new ArrayList<>();
        ArrayList<Integer> Negatives = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            if (nums[i] < 0) {
                Negatives.add(nums[i]);
            }
        }

        if (!Negatives.isEmpty()) {
            FirstNegative.add(Negatives.get(0));
        } else {
            FirstNegative.add(0);
        }

        for (int i = k; i < nums.length; i++) {
            if (nums[i - k] < 0) {
                Negatives.remove((Integer) nums[i - k]);
            }
            if (nums[i] < 0) {
                Negatives.add(nums[i]);
            }

            if (!Negatives.isEmpty()) {
                FirstNegative.add(Negatives.get(0));
            } else {
                FirstNegative.add(0);
            }
        }

        return FirstNegative;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 12, -1, -7, 8, -16, 30, 16, 18 };
        int k = 3;
        ArrayList<Integer> result = findFirstNegative(nums, k);
        System.out.println(result);
    }
}
 