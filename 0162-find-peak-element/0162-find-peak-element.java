class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n==1) return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[n-1]>nums[n-2])return n-1; //managed all the edge cases
        
        int lo = 1;
        int hi = n-2; //trimmed the search space from 1 to n-2
        while(hi>=lo){
            int mid = (lo)+(hi-lo)/2;
            
            if(nums[mid-1]<nums[mid]&&nums[mid+1]<nums[mid]){
                return mid; //if its increasing from its neighbours return the mid
            }//
            else if(nums[mid-1]<nums[mid]){
                lo = mid+1; //else if it is more than its prev surely the peak is in the right
                //thus trimming the search space and dragging lo to mid+l
            }else {
                hi = mid-1;//else the latter fall false it is in left 
            }
        }
        return -1;//-1 for dummy cases
    }
}