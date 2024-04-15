package Recursion.EasyRecursion;

public class Maximum{
    public static int FindMax (int[] array , int len) {
        //find max  of array using recursion : {2,3,4,-1}
        
       if(len > 0) {
        int RestMax = FindMax(array, len-1); //maximum among the rest 
       return Math.max(RestMax,array[len-1]); //return the maximum by comparing the maximum among rest and the current array (len-1) position.
        
       }else{//base case
         return 0;
       }
 
    }
    public static void main(String[] args) {
        int[] array = new int[]{2,3,4,1};
        int len = 4;
        
        System.out.println(FindMax(array, len));
       
       
        
    }
}
