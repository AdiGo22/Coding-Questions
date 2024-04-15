package JavaInterviewQues;

public class Fibbonaci {
    //using recursion

    //3 method fucntions - solve , print , main
    public static void Print (int n) {
        for(int i=0;i<n;i++){
          System.out.print(Solve(i)+" ");
        }
    }

    public static int Solve(int n) {
        if(n==1 || n==0){
            return n;
        }else{
            return Solve(n-1) + Solve(n-2); //return by calling and adding previous values
        }
    }

    public static void main(String[] args) {
        int n =5;
        Print(n);
    }
}
