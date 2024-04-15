package BinarySearch;

public class CountOccurence2 {
    //binary search approach
    public static int Count(int[] nums , int target) {
        //nums - {1,2,3,5,5,5,8,9} target - 5;

      

        int first = binarysearch(nums ,0 , nums.length-1, target);
        int last = binarysearch(nums , 0 , nums.length-1, target+1) - 1;
        int count = -1;

        //edge cases
        if(nums.length == 0) return -1;
        
        count = (last - first ) + 1;

        return count;
        

    }

    private static int binarysearch(int[]nums , int start , int end , int target) {
           while(start <= end){
            int mid  = start +(end-start)/2;
            if(nums[mid] < target){
                start = mid+1;
            }else{
                end = mid-1;
            }
           }
           return start;
    }

    public static void main(String[] args) {
        int[]nums = new int[]{1,2,3,5,5,5,8,9};
        int target = 5;
        System.out.println(Count(nums, target));
    }
}
