package BinarySearch;
//import java.util.*;
public class KokoBananas{
    public static int kokoeating(int[]piles , int hours){
        int k = 0;
        for(int e:piles){
            k = Math.max(k,e);
        }//k is the max value among the piles
        int div =0;
        
        for (int e : piles) {
            double division = Math.ceil((double) e / k); // Perform division and round up
            div += (int) division; // Cast the rounded result to int and accumulate in div
        }

          while(div != hours){
            k--;
            div =0;
           for (int e : piles) {
            double division = Math.ceil((double) e / k); // Perform division and round up
            div += (int) division; // Cast the rounded result to int and accumulate in div
        }
        }
          return k;
    }


    public static void main(String[] args) {
        int[]piles = new int[]{3,6,7,11};
        int hours = 8;

        System.out.println(kokoeating(piles, hours));
    }
    }

/*this is a good solution and intuitively gives the speed for koko to eat bananas but there is a problem it is subtracting k that was earlier
 * the greatest value uptill it matches the criteria , this is good solution  but while decrementing it returns the nearest integer giving the critereia
 * rather we need a minimum integer
 */