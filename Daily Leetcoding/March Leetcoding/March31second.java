import java.util.*;
public class March31second {
    public static int subArrayswithdistinct(int[] nums , int k) {
        //this is approach 2 - one pass solution unlike prev approach using sliding window as 2 pass solution.
  
    int n = nums.length;
        
    HashMap<Integer, Integer> mp = new HashMap<>();
    
    int i_chota = 0;
    int j = 0;
    int i_bada = 0;
    
    int result = 0;

    while(j < n) {
        mp.put(nums[j], mp.getOrDefault(nums[j], 0) + 1);
        
        while(mp.size() > k) {
            mp.put(nums[i_chota], mp.get(nums[i_chota]) - 1);
            if(mp.get(nums[i_chota]) == 0) {
                mp.remove(nums[i_chota]);
            }
            i_chota++;
            i_bada = i_chota;
        }
        
        while(mp.get(nums[i_chota]) > 1) {
            mp.put(nums[i_chota], mp.get(nums[i_chota]) - 1);
            i_chota++;
        }
        
        if(mp.size() == k) {
            result += i_chota - i_bada + 1;
        }
        j++;
    }
    
    return result;
}

public static void main(String[] args) {
    int[] nums = new int[] {1,3,5,2,7,5};
    int k = 2;
    System.out.println(subArrayswithdistinct(nums, k));
}
}