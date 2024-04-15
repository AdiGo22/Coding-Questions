package BackTracking;
import java.util.*;
public class SubsetsWoDup {
    public static List<List<Integer>> subwithoutdup (int[] nums) {
        Arrays.sort(nums) ;  // to make duplicates together
        List<List<Integer>> res = new ArrayList<>() ;
        GenerateSubWitoutDup( 0 , nums , res , new ArrayList<>());
        return res; 

    }

    static void GenerateSubWitoutDup(int index,int[] nums , List<List<Integer>> res , List<Integer> curr ) {
        //paste into res
        res.add(new ArrayList<>(curr)) ;

        for(int i = index ;i<nums.length ;i++) {
            if(i>index  && nums[i] == nums[i-1]) continue ; //skipping the duplicate


            curr.add(nums[i]); //start the entry point
            GenerateSubWitoutDup(i+1, nums, res, curr); //chose a path
            curr.remove(curr.size()-1); //backtrack 
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[ ] {1,2,2};
         System.out.println(subwithoutdup(nums));
    }
}

