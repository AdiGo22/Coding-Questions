package TCSNQT;
import java.util.*;
public class problem3 {
    public static void  NumberOfSundays(String today , int days) {
        //today can be any day - Sunday ,Monday and so on... , days can be any days
        Scanner sc = new Scanner(System.in);
        ArrayList<String> week = new ArrayList<>();
        week.add("Sunday");
        week.add("Monday");
         week.add("Tuesday"); 
         week.add("Wednesday");
          week.add("Thursday"); 
          week.add("Friday"); 
          week.add("Saturday");

        //today.


        int DaysLeft = 0;
 
        if(week.contains(today)) {
            int index = week.indexOf(today);
            DaysLeft = (days-index)/7;
        }

        System.out.println(DaysLeft);

    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

    
     String today = sc.nextLine();
     int days = sc.nextInt();

     NumberOfSundays(today, days);
     sc.close();
    }
}
