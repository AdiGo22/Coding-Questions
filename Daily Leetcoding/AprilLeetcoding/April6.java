package AprilLeetcoding;

import java.util.Stack;
import java.util.HashSet;

public class April6 {
    public static String MinimumRemove (String s ) {
     
        HashSet<Integer> toRemove = new HashSet<>();
        Stack<Integer> st = new Stack<>();
        StringBuilder  result = new StringBuilder();

        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == '(') {
                st.push(i);
            }else if(s.charAt(i) == ')') {
                if(st.isEmpty()) {
                    toRemove.add(i); //add index to the set.
                }
            else{
                st.pop();
            }
        }
    }
       while(!st.isEmpty()) {
        toRemove.add(st.pop());
       }


        for(int i = 0;i<s.length();i++) {
            if(!toRemove.contains(i)) {
                result.append(s.charAt(i));
            }
        }

        
        return result.toString();
    }
    public static void main(String[] args) {
        String s = "a)b(c)d";
        System.out.println(MinimumRemove(s));
    }
}