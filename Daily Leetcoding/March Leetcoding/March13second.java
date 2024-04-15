/*This is daily leetcode starting from March 2024. So today question is  - Find the pivot integer   Leetcode No.- 2485    */
public class March13second {
    public static int PivotSum (int n ) {
        //using maths , we can say int x = Math.sqrt ( n*(n+1)/2)

         if(n==1) return 1;
         int totalSum = (n*(n+1))/2;
         int pivot = (int)Math.sqrt(totalSum);

         if(pivot*pivot == totalSum ) return pivot;

         return -1;
        
        
 
 
        }
        public static void main(String[] args) {
            int n = 8;
            System.out.println(PivotSum(n));
        }
}
 //TC - o(1)