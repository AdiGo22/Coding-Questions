import java.util.*;
public class March28second {
    public static int Culprit (int[] nums , int k) {
        int  i =0;
        int  j =0;
        int result =0;
        int culprit =0;
        int n = nums.length;

        Map<Integer,Integer> map = new HashMap<>();
        while(j < n) {
            map.put(nums[j], map.getOrDefault(nums[j],0)+1);

            if(map.get(nums[j])== k+1) {
                //if any freq exceeds just of k.
                culprit++; //increment the culprit.
            }
                  if(culprit > 0) {
                    map.put(nums[i] , map.get(nums[i])-1); //remove the ith freq.
                      if(map.get(nums[i]) == 0) {
                        //if it is reached 0. 
                          culprit--;
                      }
                      i++; 
                  }

                  if(culprit == 0) {
                    result = Math.max(result, j-i+1);
                  }
                  j++;
            }
                   return result;
        }
    }

