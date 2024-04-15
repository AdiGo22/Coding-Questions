 import java.util.*;
public class FreqOfEach {
   
    public static ArrayList<Integer> frequency (int[]nums){
        //method-1 naive appraoch to find frequency of each 
        //example - {2,2,2,3,3,3,6,7} sorted array
        int counter = 1;
        ArrayList<Integer> result = new ArrayList<>();
        int start =0 ; int end = nums.length-1;
        while(start < end) {
            if(nums[start] == nums[start+1]){
                start++;
                counter++;
            }else{
                result.add(counter); //push the previous counter value
                counter = 1;
                start++;
            }
           
        }
        result.add(counter); //add the value for the last element
        return result;
    }
    public static void main(String[] args) {
        int[]nums = new int[]{2,2,2,3,3,3,6,7};
        System.out.println(frequency(nums));
    }
}
    