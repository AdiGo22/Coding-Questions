package BinarySearch;
 public class SquareRoot{ 
    public static int root(int n){
        int left = 0 , right = n; int result=0;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(mid*mid > n) {
                right = mid-1;
            }else{
                left = mid+1 ;
                result = mid;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 80;
        System.out.println(root(n));
    }
 }