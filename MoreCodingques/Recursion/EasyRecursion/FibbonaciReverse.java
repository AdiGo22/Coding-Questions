package Recursion.EasyRecursion;

public class FibbonaciReverse {
    public static int ReversetheFibbonacci (int n) {
        if(n==0 || n==1){
            return n;
        }else{
            return (ReversetheFibbonacci(n-1)  + ReversetheFibbonacci(n-2)); 
        }
    }
      //print the Reverse fibbonaci till the base case
      public static void PrintReverseFibbonaci(int n) {
       for(int i=n-1;i>=0;i--){
        System.out.print(ReversetheFibbonacci(i)+ " ");
       }
      }
    public static void main(String[] args) {
        int n = 10;
       //call the PrintReverseFibbonaci 
      PrintReverseFibbonaci(n);
    }
}
