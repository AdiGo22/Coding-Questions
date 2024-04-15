import java.util.*;
public class SingleNumber2 {
    public static int single(int[] nums) {
        //method -2 hashmap

        HashMap<Integer , Integer >map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for(Map.Entry<Integer,Integer> entry :map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey(); //return key for the value 1
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int  nums[] = new int[]{4,1,2,1,2};
        System.out.println(single(nums));
        }
}
