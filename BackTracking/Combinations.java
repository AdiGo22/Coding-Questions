package BackTracking;
import java.util.*;
public class Combinations {

    //you have to make combinations from 1-4(n) with length - k 
    public static List<List<Integer>> Combinations(int n , int  k){
         List<List<Integer>> res = new ArrayList<>();
        GenerateCombinations(1,new ArrayList<>(), res , k , n); 
        return res;
    }

    public static void GenerateCombinations(int index , List<Integer>curr , List<List<Integer>>res , int k , int n) {
        //paste the curr into the result list (res)
        if (curr.size() == k) {
            res.add(new ArrayList<>(curr));
            return;
        }
       
        //choose one path from the arraylist

        for(int i=index;i<=n;i++){
            curr.add(i); //1. chosen a path 

            GenerateCombinations(i+1, curr, res, k, n); //2.move ahead and try for the next route
            curr.remove(curr.size()-1); //3.backtrack
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int k = 2;  
        System.out.println(Combinations(n,k));
    }
    }
        