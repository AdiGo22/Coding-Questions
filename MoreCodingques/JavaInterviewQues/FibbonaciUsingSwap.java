package JavaInterviewQues;

public class FibbonaciUsingSwap {
    //solve , print , main
    public static void Print (int n) {
        for(int i=0;i<n;i++){
            System.out.print(Solve(i)+" ");
        }
    }
    public static int Solve(int n) {
     
        int first = 0 , second = 1 , next = 0; //initialised
        //do using swapping
        if(n==0 || n==1) {
            return n;
        }
    for(int i=2;i<=n;i++){
        next = first+second;
        first = second;
        second = next; //moving pointer forward;
    }
    return next;
}


public static void main(String[] args) {
    int n= 5;
    Print(n);
}
}
