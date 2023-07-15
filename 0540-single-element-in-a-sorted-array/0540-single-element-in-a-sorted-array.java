class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
         int lo =1;
        int hi = n-2;

        //edge cases
        if(n==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];//taking out the extreme left case
        if(nums[n-1]!=nums[n-2])return nums[n-1]; //taking out the extreme right case

       

        while(hi>=lo){
            int mid = (lo)+(hi-lo)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
           //criteria
              return nums[mid];
            }
            if((mid%2==1&&nums[mid-1]==nums[mid])||(mid%2==0&&nums[mid+1]==nums[mid])){
                //standing on odd and, pre equal to mid or 
                //standing on even and, post equal to mid
                lo = mid+1;
                //eliminate left;
            }else{
                hi = mid-1;//opposite of latter and thus eliminate right
            }
            }
            return -1; //iff
    }
}