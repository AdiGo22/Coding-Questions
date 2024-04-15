import java.util.*;
import java.util.ArrayList;
public class findcounts {
    public static void findcount(int len ,int num ,int diff ,int[]arr){

     ArrayList<Integer> res = new ArrayList<>();
     int difference =0;
        for(int i=0;i<len;i++){
         difference = Math.abs(num - arr[i]);

         if(difference<=diff){
            res.add(arr[i]);
         }
        }
        
        //return ans
        Collections.sort(res);
        for(int i:res){
            System.out.print(i+" ");
        }
       
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int num = sc.nextInt();
        int diff = sc.nextInt();
        int []arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        }
            sc.close();
    findcount(len,num,diff,arr);
        
    }
}
