import java.util.*;
public class maxelement {
    public static void max(int[]arr, int n){
       
       ArrayList<Integer> res = new ArrayList<>();
       for(int i=0;i<n;i++){
       res.add(arr[i]);
       }
       int max = Collections.max(res);
       int index = res.indexOf(max);

       System.out.println(max);
       System.out.println(index);
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
       max(arr,n);
    }
}
       