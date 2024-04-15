package BackTracking;
import java.util.*;
public class SubSets{
  
    public static List<List<Integer>> FindSubSets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        FindingSubsets( 0 , nums , new ArrayList(), res);  //new ArrayList will be used inside result arraylist 
        return res;  // return the final res after being backtracked
    }

    public static void FindingSubsets(int index , int[] nums , List<Integer> curr , List<List<Integer>> res) {
         res.add(new ArrayList<>(curr));
        //nums - [1,2 ,3];
        //chose a path
        for(int i = index;i<nums.length;i++){
             //paste it in result

            curr.add(nums[i]); //path is chosen
           FindingSubsets(i+1, nums, curr, res); //now , we move the choices ahead (i+1);
           curr.remove(curr.size()-1); //remove the pair added

        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,3,4};
        System.out.println(FindSubSets(nums));
    }

}