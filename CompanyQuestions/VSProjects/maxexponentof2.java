import java.util.*;
public class maxexponentof2 {
    public static int maxexponent(int a , int b){
     //int n = Math.log()
     float n;
     ArrayList<Integer> arr = new ArrayList<>();
    for(int i=a;i<=b;i++){
     n = (float)(Math.log(i)/Math.log(2));
     if(n%1 == 0){
        arr.add(i);
     }
    }
     return Collections.min(arr);
    }
    
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.print(maxexponent(a, b));
    }
    }