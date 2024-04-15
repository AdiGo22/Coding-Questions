import java.util.Scanner;
//leetcode 45
public class jumpgame2 {
    public static int jump(int[]nums){
        int jumps=0,currend=0,currfarthest=0;
       for(int i=0;i<nums.length-1;i++){
         currfarthest = Math.max(currfarthest, i+nums[i]);

         if(i==currend){
            currend = currfarthest;
            jumps++;
         }
       }
       return jumps;
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
