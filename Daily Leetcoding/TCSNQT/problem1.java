package TCSNQT;
import java.util.*;
public class problem1 {
    public static int [] chocolate (int[] arr , int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int countZero  = 0;

        for(int i : arr) {
            if(i == 0) {
                countZero++;
                continue;
            }else{
                list.add(i);
            }
        }
        //add the number of zeroes to the end of the list.
        for(int i = 0;i<countZero;i++) {
            list.add(0);
        }

        //now return array from arraylist.
        int[]result = new int[list.size()];
        for(int i = 0;i<result.length;i++) {
            result[i] =  list.get(i);
        }

        return result;
    }
    public static void main(String[] args) {
        int[]arr = {4,5,0,1,9,0,5,0};
        int n = arr.length;

        System.out.println(chocolate(arr, n));
    }
}
