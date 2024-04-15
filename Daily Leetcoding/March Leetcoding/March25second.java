import java.util.*;
public class March25second {
    public static List<Integer> FindDups (int[]nums) {
        int n = nums.length;

        List<Integer> dups = new ArrayList<>();
        for(int i=0;i<n;i++) {
            int val = Math.abs(nums[i]);
             if(nums[val-1] <  0 )  {
                 //if negative that means already visited
                 dups.add(val);
             }
             //else not make them negative to ensure you have visited.
             else{
                nums[val-1]*=-1;
             }
             }
             return dups;
        }
        public static void main(String[] args) {
            int[]nums = new int[]{1,1,2};
            System.out.println(FindDups(nums)); 
        }
    }