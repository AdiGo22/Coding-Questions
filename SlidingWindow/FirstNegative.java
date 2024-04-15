package SlidingWindow;

import java.util.ArrayList;

public class FirstNegative {
    public static ArrayList<Integer>  FindFirstNegative(int[] nums , int k){
       
        int Negative =0;int first =0;
        ArrayList<Integer> FirstNegative = new ArrayList<>();

        for(int i=0;i<k;i++){
          if(nums[i]<0){
            Negative = nums[i];
            first++;
              if(first==1){
                FirstNegative.add(nums[i]);
              }else{
                break;
              }
              //first = 0;
          }
        }  //defined  first window


        //slide the window further
        for(int i = 1 ;i<nums.length-k ;i++){
            int j = i+k;
            if (nums[i] < 0) {
                FirstNegative.add(nums[i]);
            } else {
                FirstNegative.add(0); // If no negative number is found, add 0.
            }

            if (FirstNegative.get(0) == nums[i - 1]) {
                FirstNegative.remove(0); // Remove the leftmost element if it was the first negative.
            }
        }

        return FirstNegative;
    }
    
    
public static void main(String[] args) {
    int[] nums = new int[]{12,-1,-7,8,-16,30,16,18};
    int k = 3;
    System.out.println(FindFirstNegative(nums, k));
}
}
