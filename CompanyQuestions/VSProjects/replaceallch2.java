import java.util.*;
public class replaceallch2 {
    public static void replaceallcharacter2(String s,int n, char c1, char c2){
        String ans="";
        for(int i=0;i<n;i++){
            if(s.charAt(i)==c1){
                ans+=c2;
            }else if(s.charAt(i)==c2){
                ans+=c1;
            }else{
                ans+=s.charAt(i);
            }
        }
        System.out.print(ans);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char c1 = sc.nextLine().charAt(0);
        char c2 = sc.nextLine().charAt(0);
         sc.close();
        replaceallcharacter2(input, input.length(), c1, c2);
    }
}
