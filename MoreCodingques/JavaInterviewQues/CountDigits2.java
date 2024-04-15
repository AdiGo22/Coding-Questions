package JavaInterviewQues;

public class CountDigits2 {
    public static int Count (Long n) {
        //breaking the n
        if(n==0){
            return 1;
        }else if(n<0){
            return (int) -n;
        }//negative number

        int length = 0;
        while(n!=0) {
            n=n/10; //break it
           length++;
        }
        return length;
    }

    public static void main(String[] args) {
        long n =  788744444;
        System.out.println(Count(n));
    }
}
