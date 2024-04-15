import java.util.*;
class clockconversion{
    public static String clock(String s){
     String parts[] = s.split(":");
        int hour = Integer.parseInt(parts[0]);
         int min = Integer.parseInt(parts[1]);
         int sec = Integer.parseInt(parts[2]); 
         //extracted all minute hour sec from the clock times
         if(s.endsWith("PM")&& hour!=12){
            hour +=12;//for the hours in PM that are more than 12 
         }else if(s.endsWith("AM")&& hour==12){
            hour=0;//For the hours in AM that are in 12 
         }

         String formathour = String.format("%02d",hour);
         String formatmin = String.format("%02d",min);
         String formatsec = String.format("%02d",sec);
         //formatted all the parts individually upto leading 2 digits

         return  formathour+":"+formatmin+":"+formatsec;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(clock(s));
        sc.close();
    }
}