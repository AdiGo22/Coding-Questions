import java.util.*;
public class tripletsum {
    public static boolean sum (int []arr , int n){
        int sum = 22;
      Arrays.sort(arr);
      n = arr.length;
      for(int i=0;i<n-2;i++){
        int left = i+1;
        int right = n-1;
        //shift both to finding sum combinations
       while(left<right){
        int currentsum = arr[i]+arr[left]+arr[right];
           if(currentsum==sum){
            return true;
           }else if(currentsum<sum){
            left++;
           }else{
            right--;
           }
        }
       }
       //nothing found: 
       return false;
      }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<n;i++){
            int input = sc.nextInt();
            arr[i] = input;
        }
        sc.close();
        System.out.print(sum(arr,n));
    }
    }