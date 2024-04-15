package Recursion.EasyRecursion;

public class Minimum {
    public static int FindMin(int []array , int size) {
         if(size <= 1) {
            return  array[0];
         }else{
            int RestMin = FindMin(array , size-1) ;// recursively calling for n-1 calls
            return Math.min(array[size-1], RestMin) ; //check for the last size-1 element with the restMin elements 
         }
       
    }
    public static void main(String[] args) {
        int[]array = new int[] {78,45,12,23,9};
        int size = array.length;
        System.out.println(FindMin(array, size));
    }
}
/*
 * if(size > 0) {
           int RestMin = FindMin(array,size-1); //recursively call for size-1 each time
           return Math.min(RestMin , array[size-1]); //compare with the RestMin that was calling recursively each time and current indexed number. 
        }else{
            return 0; //base case
        }
 * 
 */