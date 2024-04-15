import java.util.*;
public class palindromelongest {
    public static int find(String str){
    int n=str.length()-1;
    String sub; int maxlen=0;
    for(int i=0;i<n;i++){
      for(int j=i+1;j<=n;j++){
        sub = str.substring(i,j);
        StringBuilder rev = new StringBuilder(sub).reverse();
        String reverse  = rev.toString();
        if(sub.equals(reverse)){
            int len = sub.length();
            maxlen = Math.max(maxlen,len); 
        }
        }
       }
    
    return maxlen;
}

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    System.out.print(find(s));
    sc.close();
}
}
