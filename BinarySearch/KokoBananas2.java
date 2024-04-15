package BinarySearch;

public class KokoBananas2 {
    //Binary Search solution

    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            high=Math.max(high,piles[i]);
        }
        while(low<high){
            int mid=low+(high-low)/2;
            if(check(mid,piles,h)){
                high=mid; //if it holds true in the check function high = mid 
            }
            else
                low=mid+1; 
        }
        return low;
    }
    public boolean check(int maxpiles,int[] piles,int h){
        int hours=0;
        for(int i:piles){
            int time=i/maxpiles;
            hours+=time;
            if(i%maxpiles!=0) hours++; //move to next hour if it exceeds the division
        }
        if(hours<=h)
            return true;
       else return false;
    }
}