import java.util.*;
public class twoleastsmallest {
    public static int ProductSmallestPair(int sum, int len , int [] arr){

        if(arr==null ||len<2){
            return -1;
        }
        
        int product=1;
        Arrays.sort(arr);
     
        int add =0;
        add = arr[0]+arr[1];
        product = arr[0]*arr[1];

        return add<sum ?product : 0;

    }

    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int len = sc.nextInt();
        int []arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.print( ProductSmallestPair(sum,  len ,  arr) ) ;   
    }
}