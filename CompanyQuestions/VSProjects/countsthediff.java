import java.util.*;
public class countsthediff {
    public static int countsdiff(int len, int num , int diff , int arr[]){
        int difference =0; int count =0;
        for(int i=0;i<len;i++){
          difference = Math.abs(num - arr[i]);
           if(difference<=diff){
            count++;
           } 
        }
           return count>0?count : -1;
         

        }

        public static void main(String args []){
            Scanner sc = new Scanner(System.in);
           int len = sc.nextInt();
           int num = sc.nextInt();
           int diff = sc.nextInt();
           int arr[] =  new int [len];
           for(int i=0;i<len;i++){
              arr[i] = sc.nextInt();
           }
               sc.close();
           System.out.print(countsdiff(len,num,diff,arr));
        }
    }

      