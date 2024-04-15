/*This is daily leetcode starting from March 2024. So today question is  - Make the String Great    Leetcode No.- 1544     */
package AprilLeetcoding;
import java.util.*;

public class April5 {
    public static String GoodString(String s) {
        Stack<Character> st = new Stack<>();
        //String result = "";
     for(char c:s.toCharArray()) {
        if(!st.isEmpty()  && Math.abs((int)c - (int)st.peek())==32) {
            st.pop();
        }else{
            st.push(c);
        }
     }
     //make string result from stack
     StringBuilder result = new StringBuilder();
     while(!st.isEmpty()) {
          result.append(st.pop());
     }

     return result.reverse().toString();
    }
    public static void main(String[] args) {
        String s = "leeEetcode";
        System.out.println(GoodString(s));
    }
}
