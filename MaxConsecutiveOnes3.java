/*public class MaxConsecutiveOnes3{
    public static int max(int[]nums , int  k){
      int maxCount=0,countOne=0,countZero=0;
          
           for(int i=0;i<nums.length;i++){
          while(countZero!=k){
            if(nums[i] ==1 ){
                countOne++;
                continue;
               
            }else{
                countZero++;
                countOne++;
                continue;
                }
            }

           maxCount = Math.max(maxCount,countOne);
            countOne =0;
            countZero =0;
      
      }

      return maxCount;
        }

        public static void main(String[] args) {
            int[]nums = new int[]{1,1,1,0,0,0,1,1,1,1,0};
            int k = 2;

            System.out.println(max(nums,k));
        }
}
*/
public class MaxConsecutiveOnes3 {
    public static int max(int[] nums, int k) {
        int maxCount = 0;
        int countOne = 0;
        int left = 0; // Pointer to the left end of the window
        int countZero =0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                countZero++;
            }

            while (countZero > k) {
                if (nums[left] == 0) {
                    countZero--;
                }
                left++;
            }

            maxCount = Math.max(maxCount, i - left + 1);
        }

        return maxCount;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;

        System.out.println(max(nums, k));
    }
}
