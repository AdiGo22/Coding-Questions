package BackTracking;
import java.util.*;
public class Combinations2 {
    public static List<List<Integer>> combinations(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates) ; //sort the array
        int sum = 0;
      GenerateCombinations( 0 , sum, candidates , target , res , new ArrayList<>());
      return res; 
    }

    public static void GenerateCombinations(int index , int sum , int[]candidates , int target , List<List<Integer>> res, List<Integer> curr ) {
        //paste into res
        if(sum == target) {
            res.add(new ArrayList<>(curr));
        }

        for(int i = index ; i<candidates.length;i++){
            curr.add(candidates[i]);
            sum+=candidates[i]; //add into sum

            GenerateCombinations(i+1, sum, candidates, target, res, curr); 
            sum-=candidates[i];
            curr.remove(curr.size()-1);
        }


    }
    
}
