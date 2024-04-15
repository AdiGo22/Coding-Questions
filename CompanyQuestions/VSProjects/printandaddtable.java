import java.util.*;
public class printandaddtable {
    public static void printandadd(int n){
        int sum =0;
        int product;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1;i<=10;i++){
            product = i*n;
            arr.add(product);
            sum+=product;
        }
        System.out.println(arr);
        System.out.println(sum);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
       printandadd(n);
    }
}
