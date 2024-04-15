package BinarySearch;
public class FirstOccurence{
    public static int First (int []nums , int target) {
        //5,6,6,6,7,7,8,8,10 --target - 6
        //first - occurence

        int start = 0 , end = nums.length-1; int First = -1;

        while(start <= end) {
            int mid  = start + (end - start)/2;

            if(nums[mid] == target) {
                First = mid;
             end = mid-1;
            }

            else if(nums[mid] < target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
    return First;
    }
    public static void main(String[] args) {
        int[]nums = new int[] {5,6,6,6,7,7,8,8,10};
        int target = 8;

        System.out.println(First(nums, target));
    }
}