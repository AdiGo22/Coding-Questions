package BinarySearch;
import java.util.*;
public class FreqofEach2 {
    public static ArrayList<Integer> frequency (int[]nums){
       //example - 2,2,2,4,4,4,5,6,7
       int start = 0, end = nums.length;
       while(start<end){
        int mid = start+(end-start)/2;
        if(mid  > start) {
            end  = mid-1;
        }else{
            start = mid+1;
            
        }
       }
    }
}
