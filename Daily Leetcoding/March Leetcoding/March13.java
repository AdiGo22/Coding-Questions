/*This is daily leetcode starting from March 2024. So today question is  - Find the pivot integer   Leetcode No.- 2485    */
public class March13 {
    public static int PivotInteger (int n) {
        int totalSum = 0;
        for(int i=1;i<=n;i++) {
            totalSum+=i;
        }
//find sums from start to mid and then mid to start and then adjust the mid accordingly
        int start = 1;
        int end =  n;
        int mid = start + (end - start)/2;
       while(start <= end) {
    
        int leftSum = ((mid)*(mid+1))/2;
        int rightSum = (totalSum + mid )- (leftSum);

             if(leftSum == rightSum) {
                return mid;
             } else if(leftSum < rightSum) {
                  mid++;
             }else{
                return -1;
             }
       }
          return -1;
           

        }
        public static void main(String[] args) {
            int n = 25;
            System.out.println(PivotInteger(n));
        }
    }
