//This is daily leetcode starting from March 2024. So today question is  - Count Subarrays with fixed bound    Leetcode No.- 2444     */
public class March31 {
    public static int SubArrays(int[] nums, int minK, int maxK) {
        //find minIndex , find maxIndex
        //smaller = Math.min(minIndex , maxIndex);
        //answer = Min - culpritIndex (find CulpritIndex as well)


        int culpritIndex = -1;
        int minIndex = -1;
        int maxIndex = -1;
        int smaller = 0 ;
        int n =  nums.length;
        int count = 0;
        int result = 0;

        //find culprit index
        for(int i = 0;i<n;i++) {
            if(nums[i] > maxK  || nums[i] < minK) {
                culpritIndex = i;
            }

            //find minimum index.
            if(nums[i] == minK){
                minIndex = i;
            }
            //find maximum index
            if(nums[i] == maxK) {
                maxIndex = i;
            }
            //find smaller among indices.
            smaller = Math.min(minIndex , maxIndex);
            count = smaller - culpritIndex; 

            result+=(count<=0)? 0 : count;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 3, 5, 2, 7, 5};
        int mink = 1;
        int maxk = 5;
        System.out.println(SubArrays(nums, mink, maxk)); // Output will be 2
    }
}
