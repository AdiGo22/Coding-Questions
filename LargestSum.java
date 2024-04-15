import java.util.*;
public class LargestSum {
    public static int largest(int[]nums){
        int j=0, sum=0,maxSum=0;
       List<Integer>ListSum = new ArrayList<>();

       for(int i=0;i<nums.length;i++){
             j=i;
        while(j<nums.length){
            sum+=nums[j];
            j++;
            ListSum.add(sum);
            maxSum = Collections.max(ListSum);
        }
           sum = 0;
       }

       return maxSum;
    }

    public static void main(String[] args) {
        int[]nums = new int[]{5,4,-1,7,8};
       System.out.println(largest(nums));
       
    }
}
