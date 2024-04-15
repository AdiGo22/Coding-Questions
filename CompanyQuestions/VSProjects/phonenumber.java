import java.util.*;
public class phonenumber {
    public static void main(String arhs[]){
        Scanner sc = new Scanner(System.in);
        String s ;
        int n = sc.nextInt();
        sc.nextLine();
        String orignum="+91";
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            s = sc.nextLine();
        if(s.length()==10){
                orignum="+91"+s.substring(s.charAt(0),s.charAt(5))+" "+(s.substring(s.charAt(5),s.charAt(9)));     
        list.add(orignum);
        }
    }
    for(String i:list){
        System.out.println(i);
    }
}
}
    