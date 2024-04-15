package TCSNQT;
import java.util.*;
public class problem1second {
    public static  void chocolate () {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt(); //size of array
    int[] arr = new int[n];

    for(int i=0;i<n;i++) {
        arr[i] = sc.nextInt();
    }
    ArrayList<Integer> list = new ArrayList<>();
    int countZero  = 0;

    for(int i : arr) {
        if(i == 0) {
            countZero++;
            continue;
        }else{
            list.add(i);
        }
    }
    //add the number of zeroes to the end of the list.
    for(int i = 0;i<countZero;i++) {
        list.add(0);
    }

    //now return array from arraylist.
    int[]result = new int[list.size()];
    for(int i = 0;i<result.length;i++) {
        result[i] =  list.get(i);
    }

    //print array
    for(int i=0;i<result.length;i++){
        System.out.print(result[i]+" ");
    }
    sc.close();
}
    public static void main(String[] args) {
        chocolate();
    }

}