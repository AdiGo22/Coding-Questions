package Recursion.EasyRecursion;

public class SumOfArrayTailRecur {
    public static int Sum(int[] array , int len , int sum) {
       //using tail recursion
       if(len == 0){
        return sum; //base case
       }

       return Sum(array,len-1,sum+array[len-1]); //return the fn signature with array and length-1, sum+array[len-1];
    }
    public static void main(String[] args) {
        int[]array = new int[] {1,2,3,4,5};
        int len = 5;
        int sum = 0;
        System.out.println(Sum(array, len, sum));
    }
}
