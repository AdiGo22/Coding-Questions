package BinarySearch;
import java.util.*;
public class SpellPotionSuccess1 {
    
   

    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        
       ArrayList<ArrayList<Integer>> ProductGroups = new ArrayList<>();
       ArrayList<Integer> Prod = new ArrayList<>();
       Arrays.sort(spells);
       Arrays.sort(potions);
       long maxProduct = spells[spells.length-1]*potions[potions.length-1];
       

     //first add into Productgroups
     int product =1;
     for(int i=0;i<spells.length;i++){
        int j =0;
        while(j<potions.length){
        product = spells[i]*potions[j++];
        Prod.add(product);
     }
     ProductGroups.add(Prod); //made arraylist of arraylist
    }


    //use binary Search
    long lo = spells[0]*potions[0];
    long hi = maxProduct;
    int[] res = new int[spells.length];

    int count =0;
    while(lo<=hi){
        long mid = (lo + (hi-lo)/2);
        int index = ProductGroups.indexOf(mid);
        if(mid > success){
            //check if it is any of the group
            lo = mid+1;
             if(index!= -1){
              res[index] = count++;
             } //it is present inside group and is greater than success --> feasible case

        }else if(mid < success){
             if(index!= -1){
                res[index] = 0;
             }
        }
    }
      return res;  
}
public static void main(String[] args) {
    int[] spells = new int[]{5,1,3};
    int[] potions = new int[]{1,2,3,4,5};
    long success = 7;
    System.out.println(successfulPairs(spells,potions,success));
}
}

