import java.util.*;
public class max3 {
    public static void max(int[]arr , int n){
        int max =arr[0];
        int index =0;

        for(int i=0;i<n;i++){
             if(arr[i]>max){
                max = arr[i];
                index = i;
             }
        }
        System.out.println(max);
        System.out.println(index);
    }
    public static void main(String args []){
        Scanner sc= new  Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            int input = sc.nextInt();
           arr[i] = input;
        }
        sc.close();
        max(arr,n);
    }
}
