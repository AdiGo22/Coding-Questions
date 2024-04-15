package AprilLeetcoding;
import java.util.*;
public class April4second {
    public static int MaxDepth (String s ) {
        Stack<Character> st = new Stack<>();
        int result= 0;
        //push if you encounter opening bracket and pop for closing bracket.
        for(char ch : s.toCharArray()) {
             if(ch == '('){
            st.push(ch);
        } else if(ch == ')'){
            st.pop();
        }

        result = Math.max(result,st.size());
    }
    return result;
}
public static void main(String[] args) {
    String s ="(1+(2*3)+((8)/4))+1";
    System.out.println(MaxDepth(s));
}
}