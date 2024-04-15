package SlidingWindow;

public class LongestContinuos {
    public static int Longest(int [] nums){
           
        int window =1; int maxWindow = window;
         for(int i=0;i<nums.length-1;i++){
          if(nums[i]<nums[i+1]){
             window++;
          }else{
            window =1;
          }
          
          if(window > maxWindow){
            maxWindow = window;
          }
        }
        return maxWindow;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,4,2,3,4,5};
        System.out.println(Longest(nums));
    }
}
