package BinarySearch;
public class CountOccurence1 {
    //linear search approach

    public static int Count(int[] nums , int target ){
        //nums - {1,2,3,5,5,5,8,9} target - 5;

        int  count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target) {
              count++;
            }   
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,5,5,5,8,9};
        int target = 5;
        System.out.println(Count(nums, target));
    }
}
//O(N) - Linear Search