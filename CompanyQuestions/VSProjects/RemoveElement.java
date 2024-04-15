import java.util.*;
public class RemoveElement{
   
  public static int removeElement(int[] nums, int val) {
        //remove element from array
        ArrayList<Integer>list = new ArrayList<>();
        int count =0;
        for(int i=0;i<nums.length;i++){
         if(nums[i]==val){
           continue;
         }
         list.add(nums[i]);
        }
        //sort the array
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
          if(list.get(i)!=val){
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
       

