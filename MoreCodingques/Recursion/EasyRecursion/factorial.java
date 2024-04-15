package Recursion.EasyRecursion;

public class factorial {
    public static int FindFactorial (int n) {
        //find factorial using recursion
        if(n==1 || n==0 ){
            return 1;
        }
       else if(n>1){
              return n*FindFactorial(n-1);
        }else{
            return 0; //for negative numbers
        }
    }
    public static void main(String[] args) {
        int n = 0;
        System.out.println(FindFactorial(n));
    }
}
