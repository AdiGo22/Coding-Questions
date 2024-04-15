public class PivotIndex {
    public static int pivot(int[]nums){
        int totalSum =0 , nextSum =0 ,prevSum =0 , ans=0;
            for(int i =0;i<nums.length;i++){
                totalSum += nums[i];
            }
            for(int i=0;i<nums.length;i++){
               nextSum = totalSum-prevSum-nums[i];
               prevSum = totalSum-nextSum-nums[i];
    
               if(nextSum == prevSum){
                   ans =i;
               }else{
                   ans =-1;
               }
            }
            return ans;
        }
        public static void main(String[] args) {
            int[] nums = new int[]{1,7,3,6,5,6};
            System.out.println(pivot(nums));
        }
    }
    
   

