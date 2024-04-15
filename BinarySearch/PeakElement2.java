package BinarySearch;

public class PeakElement2 {
    public static int findPeakElement (int[] nums){
         int left = 0, right = nums.length-1;

         while(left<right){
            int mid  = left + (right-left)/2;
            if(nums[mid] > nums[mid+1]){
                right = mid; //only portion that is needed
            }else {
                  left = mid+1;
            }
        }
            return left;
         }
    
    public static void main(String[] args) {
        int[]nums = new int[]{1,2,3,5,6,4};
        System.out.println(findPeakElement(nums));
    }
}
