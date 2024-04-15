import java.util.*;
public class twoDtoOneD {
    public static List<List<Integer>> findMatrix (int[] nums ) {
  
               int mp[] = new int[nums.length+1];
        
               ArrayList<List<Integer>> result = new ArrayList<>();
                 for(int num : nums) {
                       int freq = mp[num];
                       if(freq == result.size())
                       {
                           result.add(new ArrayList<>()); //add another row
                       }
        
                       result.get(freq).add(num);
                       mp[num]++;
                 } 
                 return result;
                }
        
    public static void main(String[] args) {
        int nums[] = new int[]{1,1,2,3,4};
        System.out.println(findMatrix(nums));
    }
}
