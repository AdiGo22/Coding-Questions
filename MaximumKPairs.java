import java.util.*;
public class MaximumKPairs{
    public int pairs(int[]nums, int k){
        int j =0 , diff =0; int len;

      ArrayList<Integer> pair = new ArrayList<>();
        
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=k){
                pair.add( nums[i]);
                diff = k-pair.get(j);
                j++;
            //base

            if(nums[i++]== diff){
                pair.add(nums[i++]);
                //transfer data of array into an arraylist and then emmpty the array
            
            }else{
                pair.remove(nums[i]);
            }
           
        }
    }
    len = pair.size()/2;
    return len;
}
}


//my approach at first click but it is not meeting the right output