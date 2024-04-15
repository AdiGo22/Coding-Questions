import java.util.*;
public class SingleNumber {
    //method 1  - sort and then use linear search
    public static int single( int[] nums ){
        Arrays.sort(nums);//sorted
        int single = nums[0];
        for(int i=0;i<nums.length-1;i+=2) {
          if(nums[i]==nums[i+1]) {
            single = nums[i+2];
          }
        }
        return single;
        
    }
    public static void main(String[] args) {
        int[] nums = new int[] {1,1,2};
        System.out.println(single(nums));
     }
}


/*sort the array - 1
 * 1,1,2,2,4
 * loop till every element if(nums[i]==nums[i+1]) single = nums[i+2]; 
 */