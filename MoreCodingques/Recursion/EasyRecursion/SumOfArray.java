package Recursion.EasyRecursion;



public class SumOfArray {
    public static int Sum (int[]array , int n ) {
        //print the sum of the array using recursion - n = array.length 
       if(n <=1) {
        return n;
       }else{
        //sum the array numbers
        return(array[n-1] +Sum(array,n-1)) ;
       }
    }
    public static void main(String[] args) {
        int []array = new int[]{1,2,3,6};
        int n = array.length;
        System.out.println(Sum(array, n));
    }
}

/*
 *  if(n>0) {
            return (array[n-1]+Sum(array,n-1));
           
        }else{
            return 0;
        }

 * 
 */