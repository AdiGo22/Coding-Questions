package BackTracking;
import java.util.*;
public class CombinationSum1 {
    public static List<List<Integer>> Combinations(int [] candidates , int target) {
     //candidates - [2,3,6,7] , target - 7 , doesnt matter repeat any individual 
    int sum = 0;
     List<List<Integer>> res = new ArrayList<>() ;
     GenerateCombinations(candidates , target , 0, new ArrayList() , res , sum );
     return res;
        } 

public static void GenerateCombinations(int [] candidates , int target , int index , List<Integer> curr, List<List<Integer>> res,int sum ) {
        

    if(sum == target){
    res.add(new ArrayList<>(curr));
    return; 
    }

    if (sum > target || index == candidates.length) {
        return;
    } //base case 

    for(int i=index; i<candidates.length;i++){
      curr.add(candidates[i]);
      sum+=candidates[i];
      GenerateCombinations(candidates, target, i, curr, res, sum);
      
      sum-=candidates[i];
      curr.remove(curr.size()-1); //backtrack

    }
}

public static void main(String[] args) {
    int[]candidates  = new int[]{2,3,5,6,7};
    int target = 7;
    System.out.println(Combinations(candidates, target));
}
}