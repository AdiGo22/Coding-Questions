class Solution {
    public int mySqrt(int x) {
       long lo =0;
       long hi = x;
       long ans =0;
       while(hi>=lo){
           long mid = (lo)+(hi-lo)/2;
           long sq= mid*mid;
           if(sq<=x){
               ans = mid;
               lo = mid+1;
           }else{
               hi = mid-1;
           }
       }
       return (int)(ans);
    }
}