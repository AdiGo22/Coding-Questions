package BinarySearch;

public class GuessGame {
    public int guessNumber(int n){
   /** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */
    public int guess(int n) {
        //binary search
        int lo =1 , hi = n;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            int guessNum = guess(mid); //this is called from predefined API

            if(guessNum  == -1){  //number picked is higher 
              hi =  mid-1;
            }else if(guessNum == 1){ //number picked is lower
              lo = mid+1; 
            }else{
                return mid;
            }
        }

        return -1;
    }
}