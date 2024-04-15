package Recursion.EasyRecursion;

public class SumOfDigits {
    public static int CalculateSum (int n) {
        //calculate the sum of the digits of n number
       if(n<=9){
        return n;
       }else{
          return (n%10 + CalculateSum(n/10)); //remainder added with decreased dividend space by 10;
       }     
    }
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(CalculateSum(n));
    }
}

/*
 * if(n>0) {
         return (n%10 + CalculateSum(n/10));
        }else{
            return 0; 
        }
    }
 */