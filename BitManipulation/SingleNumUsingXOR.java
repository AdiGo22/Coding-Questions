package BitManipulation;

public class SingleNumUsingXOR {
    public static int single (int[] nums) {
        int xor = 0;
        for(int num : nums) {
            xor^=num;
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 4,1,2,1,2};
        System.out.println(single(nums));
    }
}
