import java.util.*;
class MajorityElement {
    //leetcode 169
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int check = n/2;
        int result=0;
        for(int i=0;i<n;i++){
        if(map.containsKey(nums[i])){
            map.put(nums[i],map.get(nums[i])+1);
        }else{
            map.put(nums[i],1);
        }
        }//hashtable is created with frequencies mapped

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()>check){
              result = entry.getKey();
              return result;
            }
        }
           return -1;
    }
}