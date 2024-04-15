
public class ContinuousOne {
    public static int solve(int [] nums){
        int count = 0;
        int maxCount = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                maxCount = Math.max(count,maxCount);
            }else {
                count = 0; //if 0 comes;
            }
        }
        return maxCount;
    }

    public static void main(String args []){
        /*Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i=0;i<n;i++){
            int input = sc.nextInt();
            nums[i] = input;
        }
        */
        int[] nums = new int[] {1,0,1,1,1,0,1,1};
        System.out.println(solve(nums));

    }
    
}
