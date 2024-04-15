import java.util.Arrays;

public class March9second {
    public static int Maximumfreq (int[] nums) {
        //using int of 101 numbers since constraint for this question is from 0 to 101
        int[]arr = new int[101];
        int maxFreq = 0;
        for(int num : nums) {
            arr[num]++;
            maxFreq = Math.max(maxFreq, arr[num]);
        }
              final int finalMaxFreq = maxFreq; //why final keyword ? To access inside lambda
        return (int) Arrays.stream(arr).filter(count -> count == finalMaxFreq).count() * finalMaxFreq;
    }

public static void main(String[] args) {
    int[]nums = new int[]{1,2,2,3,4,4};
    System.out.println(Maximumfreq(nums));
}
}