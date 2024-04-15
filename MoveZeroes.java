public class MoveZeroes{
    public void moveZeroes(int[] nums) {
    
        int  j=0;
        //int [] output = new int [nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
           nums[j] = nums[i];
            j++;
            }
        }
       // int NumberOfZeros = nums.length-(j+1);
       
        for(int i=j;i<nums.length;i++){
          nums[j] = 0;
        }

        System.out.print(nums);
    }
}