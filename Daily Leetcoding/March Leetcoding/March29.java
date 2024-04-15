import java.util.*;
public class March29 {
    public static long CountSubArrays(int[] nums , int k) {
        int i = 0;
        int j = 0;
        long result = 0;
        int countMax = 0;

        int maxE = Arrays.stream(nums).max().getAsInt();
        int n = nums.length; 

        while(j < n) {
            if(nums[j] ==  maxE) {
              countMax++;
            }
              while(countMax >= k) {
                //exceeds
                result+=n-j; //remove the j from the result

                 if(nums[i] ==  maxE) {
                     countMax--;
                 }
                 i++;
              }
              j++;
        }
        return result;
    }
}