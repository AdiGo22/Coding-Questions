package AprilLeetcoding;
//import java.util.*;
public class April4 {
    public static int MaxDepth(String s) {
       // Stack<Character> st = new Stack<>();
        int depth = 0; int MaxDepth = 0;
        for(char ch : s.toCharArray()) {
            if(ch == '(') {
            depth++;
             } else if(ch== ')') {
                    depth--;
                }

                MaxDepth = Math.max(MaxDepth,depth);
            }
           

        return MaxDepth;
    }
    public static void main(String[] args) {
        String s = "(1)+((2))+(((3)))";
        System.out.println(MaxDepth(s));
    }
}
