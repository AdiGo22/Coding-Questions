import java.util.Scanner;

public class Removefromsort1  {
        public static int removeDuplicates(int[] nums) {
           int n = nums.length;
           int index =1;
           for(int i=1;i<n;i++){
               if(nums[i]!=nums[index-1]){
                   nums[index] = nums[i];
                   index++;
               }
           }
           return index;
        }
 public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[]nums= new int[n];
      for(int i=0;i<n;i++){
        nums[i] = sc.nextInt();
      }
      System.out.println(removeDuplicates(nums));
      sc.close();
    }
  }

  

    

