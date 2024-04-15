package BinarySearch;

public class FirstAndLastOccurence1 {
    //nums[] = {2,2,2,3,4,4,4,8} target - 4  - ans-[4,6]
    public static int[] FirstAndLast  (int[] nums , int target) {
        //find a naive solution i.e Linear Search 


        int start = -1 , end = -1 ;
        int[]result = new int[2];
        for(int i=0;i<nums.length;i++){
            if( nums[i] == target){
                  if(start == -1) {
                    start = i; // if it still the same it is the first
                  }
                   end = i; //update the last found element
                
            }
        }

            result[0] = start ;
            result[1] = end;
        
            return result;
        }

        public static void main(String[] args) {
            int[]nums = new int[]{2,2,2,3,4,4,4,8};
            int target = 4;
            System.out.println(FirstAndLast(nums, target));
        }
    }

                 