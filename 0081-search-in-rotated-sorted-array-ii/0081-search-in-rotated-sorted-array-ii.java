class Solution {
    public boolean search(int[] nums, int target) {
        // this is same as problem for earlier Leetcode 33 but is different in approach
        //the latter approach dont work here as :
        /*
        if [3,2,1,3,3,3,3]  nums[mid] = 3 , nums[lo] = 3, nums[hi] = 3 
        cant chek the condition written in the solution of leetcode 33 as all 3 are equal
        */
  //trimming the search space is important
   
     int n =nums.length;
    int lo =0; int hi = n-1; 
        
        while(hi>=lo){
            int mid = (lo)+(hi-lo)/2;
            if(nums[mid] == target) return true;

           //extra snippet from leetcode 33
            if(nums[lo]==nums[mid] && nums[mid] == nums[hi] ){
                //shrink the space
                lo +=1;
                hi -=1; 
                continue;
            } //if further more duplicates found continue till u matches above condition
            
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
        return  false;
    }
}