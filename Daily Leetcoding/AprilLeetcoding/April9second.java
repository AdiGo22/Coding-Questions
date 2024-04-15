package AprilLeetcoding;

public class April9second {
    public static int TimetoBuyTicket (int[]tickets , int k) {
       int time = 0;
        while(tickets[k]!=0) {
            for(int i = 0; i<tickets.length;i++)  {
                if(tickets[k]==0) break;
                if(tickets[i]!=0){tickets[i]-=1; time++;}
            }

        }
        return time;
    }
    public static void main(String[] args) {
        int[] tickets = new int[] {2,3,2};
        int k = 2;
        System.out.println(TimetoBuyTicket(tickets, k));
    }
}
