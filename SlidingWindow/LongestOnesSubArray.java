package SlidingWindow;

import java.util.ArrayList;

public class LongestOnesSubArray {
    public static int longest(int[] nums){
        //find positions of all zeros and collect them in an arraylist
         ArrayList<Integer> Zeroes = new ArrayList<>();
         Zeroes.add(0);
          int longest = 0; int maxDistance = longest;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                Zeroes.add(i);
            }
        } 
        //Zeroes.add(0);
        
    //if all the elements are non zeros
        boolean flag = false;
        for(int i:nums){
            if(i== 0){
                flag = false;
                break;
            }else{
                flag = true;
            }
        }

        if(flag == true){
          maxDistance = nums.length-1;
        }
         
       
        //find distance inclusive between the zeroes
       
        for(int i=0;i<Zeroes.size()-1;i++){
          longest = Zeroes.get(i+1) - Zeroes.get(i) +  1  ;  //because 1 deletion is allowed
          if(maxDistance < longest){
            maxDistance = longest;
          }
         }
         return maxDistance ;
    
        }
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,0,0,1,1,1,0,1};
        System.out.println(longest(nums));
    }
}
