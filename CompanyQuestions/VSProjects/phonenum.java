import java.util.*;
public class phonenum {
    //accepts n phone number
    //remove the prefixes - 0/+91/91 and add +91 to each number
    // make a string as - +91XXXXX XXXXX
    // sort the phone numbers and print them accordingly

    public static void main (String arhs[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); //accepts number of phone numbers
    sc.nextLine();
    String number ="";
    HashMap<Long,Integer> partone = new HashMap<>(); 
    long[] convert= new long[n];

    for(int i=0;i<n;i++){
        String s = sc.nextLine();
        if(s.length()>10){
        if(s.charAt(0) =='0'){
        s="+91"+s.substring(1,6)+" "+s.substring(6,s.length());
        convert[i] = Long.parseLong(s.substring(1,6));
        partone.put(convert[i], i);
        }else{
            s= "+91"+s.substring(2,7)+" "+s.substring(7,s.length());
            convert[i] = Long.parseLong(s.substring(2,7));
        partone.put(convert[i], i);
        }
    }else{
    if(s.length()==10){
        s="+91"+s.substring(0,5)+" "+s.substring(5,s.length());
         convert[i] = Long.parseLong(s.substring(0,5));
        partone.put(convert[i], i);
    }
}
    }
    
    Arrays.sort(convert);
}
}
