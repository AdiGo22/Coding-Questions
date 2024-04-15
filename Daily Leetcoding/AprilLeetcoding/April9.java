package AprilLeetcoding;
import java.util.*;
public class April9 {
    
    public static int TimerequiredtoBuy (int[]tickets ,  int k) {
        //tickets - the number of tickets individiual want to buy.
        //k - the selected individual.
        int time =0;
        for(int i = 0;i<tickets.length;i++) {
            if(i<=k) {
                //at or before the kth posn
                time+=Math.min(tickets[k],tickets[i]);
            }else{
                time+=Math.min(tickets[k]-1,tickets[i]);
            }
        }

        return time;
    }



    public static void main(String[] args) {
        int[] tickets = new int[] {2,3,2};
         int  k = 2;
        System.out.println(TimerequiredtoBuy(tickets, k));
    }
}
