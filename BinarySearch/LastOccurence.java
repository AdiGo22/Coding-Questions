package BinarySearch;

public class LastOccurence {
    //2,3,4,4,4,6,6,8 target - 6 

    public static int Last(int [] nums, int target) {
        int start = 0 , end = nums.length-1 , last = -1;

        while(start <= end) {
            int mid  = start + (end - start)/2;

            if(nums[mid] == target) {
                last =  mid;
                start = mid+1;

            } //check is any other value = target after mid

            else if(nums[mid] > target) {
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return last;
    }

    public static void main(String[] args) {
        int[]nums = new int[] {2, 3, 4, 4, 4, 6, 6, 8};
        System.out.println(Last(nums, 6));
    }
}
