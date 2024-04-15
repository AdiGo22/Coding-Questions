import java.util.*;
public class  replaceallch3 {
    public static String replaceChars(String s, char ch1, char ch2) {
        // Replace ch1 with a temporary character
        String step1 = s.replace(ch1, '*');
        
        // Replace ch2 with ch1
        String step2 = step1.replace(ch2, ch1);
        
        // Replace the temporary character with ch2
        String result = step2.replace('*', ch2);
        
        return result;
    }

public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char c1 = sc.nextLine().charAt(0);
        char c2 = sc.nextLine().charAt(0);
         sc.close();
       System.out.print( replaceChars(input,c1, c2));
    }
}
