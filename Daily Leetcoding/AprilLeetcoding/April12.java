package AprilLeetcoding;

public class April12 {
       public static  int[] getLeft(int[]height , int n) {
        int[]leftMax = new int[n];   //L-R traversal : NSL
         leftMax[0] = height[0]; //added the pre-index value;

         for(int i = 0;i<n;i++) {
            leftMax[i] = Math.max(leftMax[i-1],height[i] );
         }
         return leftMax;
       }

       public static int[] getRight(int[]height, int n) {
        int[]rightMax = new int[n];//R-L traversal : NSR
        rightMax[n-1] = height[n-1];

        for(int i=n-2;i>=0;i--) {
            rightMax[i] = Math.max(rightMax[i+1] , height[i]);
        }

        return rightMax;
       }

       //find the width == rain water trapped.
    public static int trap (int[]height) {
        int n = height.length;
        if(n==1 || n== 0) return 0;

        int[]leftMax = getLeft(height,n);
        int[]rightMax = getRight(height, n);

        int sum = 0;
        for(int i=0;i<n;i++) {
            sum+=Math.min(leftMax[i] ,rightMax[i]) + height[i] ;
        }

        return sum;
    }

    public static void main(String[] args) {
       
      

       
      
    }
}
