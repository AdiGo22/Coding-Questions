public class LongestOnesDeletingZero {
    public static int longest (int[]nums){
        int count =0, skip=0; int maxCount =0;
        for(int i=0;i<nums.length-count;i++){
          int j = i+count;
          if(nums[i] == 1){
            count++;
              if(nums[j]!=1){
                 skip++;
                 j+=skip; //skip j to "skip"
              }
              if(skip>1){
                maxCount = count;
              }
          }

          if(count> maxCount){
            maxCount = count;
          }
        }

        return maxCount;
    }
    public static void main(String[] args) {
        int[]nums = new int[]{1,1,1,0,1,1,0,1};
        System.out.println(longest(nums));
    }
}
