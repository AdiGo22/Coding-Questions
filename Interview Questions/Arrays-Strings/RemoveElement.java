 //remove element from array
import java.util.*;
//leetcode 27
class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int count = 0; // Initialize a count to keep track of valid elements.

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i]; // Move valid elements to the front of the array.
                count++;
            }
        }

        return count;
    }


    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int val = sc.nextInt();
      int[]nums= new int[n];
      for(int i=0;i<n;i++){
        nums[i] = sc.nextInt();
      }
      System.out.println(removeElement(nums,val));
      sc.close();
    }
  }
      
  
      