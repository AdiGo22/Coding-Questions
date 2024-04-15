import java.util.*;
public class movehyphen{
    public static String movehyphens(String s ,int n){
        //n- s.length()
        String ans="";
        String correctString ="";
        int count =0;
        for(int i=0;i<n;i++){
             
        char c = s.charAt(i);
        if(c=='-'){
          //delete hyphen and add number of hyphens on start
          count++;
          String ch = Character.toString(c);
         correctString = s.replace(ch,"");
        }
    }
       for(int i=0;i<count;i++){
        ans+="-";
       }
       ans+=correctString;
       return ans;
    }


public static void main (String args[]){
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
sc.close();
System.out.println(movehyphens(s,s.length()));

}
}