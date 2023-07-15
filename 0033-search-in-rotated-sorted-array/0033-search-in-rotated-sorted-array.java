//1- the whole array is not sorted at once rather it is rotated at any pivoted point 
        //2- this mean that sorted array set is present but not as a whole
        //3- search for mid and check for the sorted set - left/right 
        //4- check in the sorted half - iff left : if target lies in left half eliminates th right half              by dragging high to mid-1
        //else if latter is the case drag the low as mid+1
     


class Solution {
    public int search(int[] nums, int target) {
        
     int n =nums.length;
    int lo =0; int hi = n-1; 
        
        while(hi>=lo){
            int mid = (lo)+(hi-lo)/2;
            if(nums[mid] == target) return mid;
           
            //iff left sorted
            if(nums[lo]<=nums[mid]){
                
                if(nums[lo]<=target && target<=nums[mid])
                    //the target is present inside the left half
                   hi = mid-1;
            
                else 
                lo = mid+1; //if target is in the right half
                
             
        }else //right half sorted
            {
                if(nums[hi]>=target && nums[mid]<=target)
                lo = mid+1;
                else
                hi = mid-1; //if target is not in the sorted right half rather on the left half
            }
        }
        return -1;
    }
}