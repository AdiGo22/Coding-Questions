import java.util.*;
public class ratsaccenture{
   
    public static int rats(int n , int[]arr , int r, int unit){
        int food = r*unit;
        
        int addall=0;
        int i=0;

        if(arr == null || n==0){
          return -1;
        }
      while(i<n&& addall<food){
        addall+=arr[i];
        i++;
        
      }
      if(addall<food){
       return  0;
      }
      return i;
    }

    public static void main (String[]args)
    {
      Scanner sc = new Scanner (System.in);
      int r = sc.nextInt ();
      int unit = sc.nextInt ();
      int n = sc.nextInt ();
      int arr[] = new int[n];
  
      for (int i = 0; i < n; i++)
        arr[i] = sc.nextInt ();

        sc.close();
      System.out.println (rats(n, arr, r, unit));
    }
  }


