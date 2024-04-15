package BinarySearch;
public class MinimumRotatedArray {
    //number of rotations an array has been rotated
    //nums wil be sorted but it will be in circular format


    public static int NumberOfRotations(int[] nums) {
        int left = 0, right = nums.length - 1;
        
       
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
               left = mid+1;
            } else {
               right = mid;
            }
        }

        // The number of rotations is the index of the smallest element.
        return left;
 
    }
    public static void main(String[] args) {
        int[] nums = new int[]{4,5,6,7,0,1,2};
        System.out.println( NumberOfRotations( nums));
    }
}


//the logic is very beautiful that says find the index of minimum element inside the rotated array - this shows how much times array is rotated