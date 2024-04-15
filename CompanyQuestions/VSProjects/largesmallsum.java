import java.util.*;

public class largesmallsum {
    public static int LargeSmallSum(int len, int[] arr) {
       ArrayList<Integer>even = new ArrayList<>();
       ArrayList<Integer>odd = new ArrayList<>();
        
        int result = 0; 

        for (int i = 0; i < len; i++) {
            if (i % 2 == 0) {
                even.add(arr[i]);
        }else{
            odd.add(arr[i]);
        }
    }

        Collections.sort(even);
        Collections.sort(odd);
           
        result = even.get(even.size()-2)+odd.get(1);

        return len > 3 ? result : 0;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.print(LargeSmallSum(len, arr));
    }
}
