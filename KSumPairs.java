import java.util.*;
public class KSumPairs {
   public int maxOperations(int[] nums, int k) {
    
            int maxOps = 0;
    
            Map<Integer, Integer> countMap = new HashMap<>();
    
            for (int num : nums) {
                int complement = k - num;
    
                if (countMap.containsKey(complement) && countMap.get(complement) > 0) {
                    maxOps++;
                    countMap.put(complement, countMap.get(complement) - 1);//we have used one instance of it
                } else {
                    countMap.put(num, countMap.getOrDefault(num, 0) + 1);
                }
            }
    
            return maxOps;
        }
    }
