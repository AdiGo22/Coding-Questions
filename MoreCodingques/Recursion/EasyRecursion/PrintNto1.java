package Recursion.EasyRecursion;

public class PrintNto1 {
    public static void PrintN(int n){
        //now to print N to 1;
       if(n>0) {
        //since printing for N to 1 that is reverse
        //therefore for n = 10 first print n and then recursively call for n-1

        System.out.print(n+"    ");
        PrintN(n-1);
       }
       return ;//base case; if not greater than 0 stop and then return
    }
    public static void main(String[] args) {
        int n = 10;
        PrintN(n);
    }
}
