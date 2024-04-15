import java.util.*;
public class MajorityElement3 {
    public static List<Integer> majority(int [] nums){
    int majority = nums.length/3;
    List<Integer> answer = new ArrayList<>();

    //make a hashmap check the freq , if it is greater than majority add into your answer
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i:nums) {
        map.put(i, map.getOrDefault(i,0)+1);
    }

    //enter into hashmap
    for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
      if(entry.getValue() > majority){
        answer.add(entry.getKey());
      }
    }

    return answer;
    }
    public static void main(String[] args) {
        int[] nums = new int[] {1,2};
        System.out.println(majority(nums));
    }
}



/* 
for(Map.Entry<Integer,Integer> Entry : map.entrySet()) {
  entry.getValue() - value , entry.getKey() - key
}
*/