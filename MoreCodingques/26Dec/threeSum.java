import java.util.*;
public class threeSum {
    public static List<List<Integer>> threesum (int[] nums) {
       //find triplets from nums that sums to give 0 may/may not be contagious
     int first = 0;
     int last = nums.length-1;
     List<List<Integer>> answer = new ArrayList<>();
     List<Integer> list = new ArrayList<>();
     int triplet;
     Arrays.sort(nums); //sort the array

     for(int second=1;second<nums.length-1;second++) {
        triplet = nums[first]+nums[second]+nums[last];

       if(triplet == 0 ) {
          list.add(nums[first]);
          list.add(nums[second]);
          list.add(nums[last]);

          answer.add(list);

          first++; //if found then just increment the first pointer
       }
       else if(triplet < 0) {
        first++;
        //increment  pointers except the last
       } 
       else{
         last--;
       }
     }
    
    return answer;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        System.out.println(threesum(nums));
    }
}