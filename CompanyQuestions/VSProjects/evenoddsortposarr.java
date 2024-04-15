import java.util.*;
public class evenoddsortposarr {
    public static int  evenodd(int[]arr,int n){
        //arr = new int[n];
        ArrayList<Integer> even  = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        int add=0; 

        int SecondLargestEven , SecondLargestOdd;
        for(int i=0;i<n;i++){
            if(i%2==0){
                even.add(arr[i]);
            }else{
                odd.add(arr[i]);
            }

        }
        Collections.sort(even);
        Collections.sort(odd);

        SecondLargestEven = even.get(even.size()-2);
         SecondLargestOdd = odd.get(odd.size()-2);
         add+=SecondLargestOdd+SecondLargestEven;
         return add;
    }
  
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array"+ " ");
        int size = sc.nextInt();
        int [] array = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("enter element at "+i+"index"+" ");
            int input = sc.nextInt();
            array[i] = input;
        }
          sc.close();
        System.out.print(evenodd(array,size));
    }
}
        /*This line initializes a new array arr of size n, 
        and it overwrites the input array that you passed as a parameter to the evenodd method.
         As a result, the elements of the input array were effectively lost and replaced with zeros. */
    
        