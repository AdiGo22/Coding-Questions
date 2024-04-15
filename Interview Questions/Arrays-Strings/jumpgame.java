import java.util.Scanner;

public class jumpgame {
    //Leetcode 55
    public static boolean jump(int []nums){
        int lastindex =0;
        for(int i=nums.length-1;i>=0;i--){
            if(i+nums[i]>=lastindex){
                lastindex = i; // last index at the ith position if it statisfies the above condition
            }
        }
        return lastindex ==0; //return true or false if it has reached the 0th position that is first index
    }

     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine(); //array in string format accepted
        String arr[] = n.split(","); 
        int []nums = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            nums[i]= Integer.parseInt(arr[i]);
        }
        System.out.println(jump(nums));
        sc.close();
    }
}


