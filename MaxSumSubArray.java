
public class MaxSumSubArray {
      public static int max(int[]nums , int k){
     
        int sum = 0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
    
        int maxSum = sum;
        for(int i=0;i<nums.length-k;i++){
            int j = i+k;
          
            sum-=nums[i]; //exclude first
            sum+=nums[j]; //include next;
             //for maxSum
        if(maxSum < sum){
            maxSum = sum;
        }

        }

        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{112,52,41,22,9,9,11};
        int k = 3;
        System.out.println(max(nums, k));
    }
      }

      
      