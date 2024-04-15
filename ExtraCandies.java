import java.util.*;
public class ExtraCandies {
   
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
          int greatest = Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
          
             greatest = Math.max(candies[i],greatest); //greatest among candies is calculated
        }
       /* int []newcandies = new int[candies.length];
        for(int i=0;i<newcandies.length;i++){
            newcandies[i] = candies[i]+extraCandies; //made a new array with added extracandies
        } */

       List<Boolean>result = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            int curr = candies[i]+extraCandies;
            if(curr>= greatest){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}

