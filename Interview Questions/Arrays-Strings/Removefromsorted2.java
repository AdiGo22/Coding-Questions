import java.util.Scanner;
//leetcode 80
public class Removefromsorted2 { 
    public static int remove(int []arr){
        int n = arr.length;
        //at most 2 is possible
        int count =2;
        for(int i=2;i<n;i++){
            if(arr[i]!=arr[count-2]){
            arr[count] = arr[i];
            count++;
            }
        }
        return count;
    }      

    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[]nums= new int[n];
      for(int i=0;i<n;i++){
        nums[i] = sc.nextInt();
      }
      System.out.println(remove(nums));
      sc.close();
    }
  }

  