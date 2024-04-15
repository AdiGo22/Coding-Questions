package BackTracking;
import java.util.*;
public class Combinations3 {
    
    public static List<List<Integer>> Combinations ( int k , int n ) {
        //n - addition sum  , k - length of combinations  {1-9 only allowed}
        int sum = 0;
        List<List<Integer>> res = new ArrayList<>();
        GenerateCombinations(1, k , n ,sum ,  res , new ArrayList<>());
        return res ;
    }
   public  static void GenerateCombinations(int index , int k  , int n , int sum, List<List<Integer>> res , List<Integer> curr) {
        
       
        if(curr.size() == k  && sum ==  n) {
            res.add(new ArrayList<>(curr));
        } //paste into res

        for(int i = index ;i<=9;i++){
           curr.add(i) ; 
           sum+=i; 
           GenerateCombinations(i+1 , k , n, sum , res , curr);
           sum-=i; //
           curr.remove(curr.size()-1);
        }
   }
        }

