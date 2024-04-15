package BitManipulation;

public class CountingBits1 {
    public static int[] countingOnes (int n){
         //1- convert into binary and count the ones
 
         //make an array from 0 to n
         int[] nums = new int[n+1];
         String[] BinaryString = new String[n+1];
         for(int i=0;i<nums.length;i++){
             nums[i] = i;
         }//filled

         for(int i=0;i<nums.length;i++){
            BinaryString[i] = Integer.toBinaryString(nums[i]); //BinaryString contains Binary conversion of numbers in array numsaz
         }
         //counting number of ones
         int OnesCount = 0;
         for(int i=0;i<BinaryString.length;i++){
           OnesCount = 
         }

         }
    }
}