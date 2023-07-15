class Solution {
    public int[] searchRange(int[] nums, int target) {
        //assigning the default answer
        int []ans = new int[] {-1,-1};
        
        if(nums==null || nums.length==0) return ans; //return the default value of ans
        
        int first = binarysearch(nums,0,nums.length-1,target);
        int last = binarysearch(nums,0,nums.length-1,target+1)-1; 
       
        /*By using target + 1 as the search value in binarySearch,
        we are essentially looking for the first element greater than target. 
        This will give us the index of the element right after the last occurrence of target.
          However, since we want the index of the last occurrence itself,
           we subtract 1 from the result to adjust the index accordingly.*/
        
        
        if(first<0 ||first>=nums.length ||nums[first]!=target) return ans; //return the default value
        
        //if the first goes beyond the scope of data set we return {-1,-1}
        
        ans[0] = first;
        ans[1] = last; //assigned
        return ans;
        
    }
    
    private int binarysearch(int[]nums,int lo, int hi,int target) {
        while(hi>=lo){
            int mid = (lo)+(hi-lo)/2;
            if(nums[mid]<target) lo = mid+1;
            else hi = mid-1;
        }
        return lo;
        // lo is returned is that if the target value is not found in the nums array, the lo index represents the correct position where the target value should be inserted to maintain the sorted order of the array. If the target value is found, then lo represents the index of its first occurrence.
    }
}