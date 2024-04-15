import java.util.ArrayList;
import java.util.Collections;

public class MaximumAverageSubarray {
    public static double maximum(int[]nums, int k){
        int  sum =0; double average;
       ArrayList<Double>list = new ArrayList<>();
        for(int i=0;i<(nums.length-k+1);i++){
            int l=i , j=i+k-1;
            while(l!=j+1){
            sum+=nums[l];
            l+=1;
            }
            average = (double)sum/k;
            list.add(average);
            sum=0;
        }

        return Collections.max(list);
    }

    public static void main(String args[]){
        int[] arr = new int[] {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(maximum(arr,k));
    }
}
