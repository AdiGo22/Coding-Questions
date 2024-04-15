package Recursion.EasyRecursion;
public class DectoBinary {
    public static int Convert(int n) {
        //rule  - remainder + 10 *(Dividend/2);

        if(n == 0) return n; //base case
        else{
            return (n%2 + 10*Convert(n/2)); //first take remainder add it with 10's position entering into Convert with reducing n by n/2; 
        }

    }
    public static void main(String[] args) {
        int n = 123;
        System.out.println(Convert(n));
    }
}
