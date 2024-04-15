package Recursion.EasyRecursion;

public class SumtillN {
    public static int Sum(int n) {
        //base case
        if(n>1) {
            return (n)+Sum(n-1);
        }else{
            return n;
        }
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(Sum(n));
    }
}
/*    
     if(n<1){
        return n;
     }else{
        return n+Sum(n-1);
     }
    } */