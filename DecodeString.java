import java.util.Stack;

public class DecodeString {
    public static String Decode(String s){

      Stack<Character> st = new Stack<>();
      for(int i=0;i<s.length();i++){
        st.push(s.charAt(i));
      } //filled all the chars in stack
      String ans="" , bracket ="";
      while(st.size()>0){
      if(st.peek()==']'){
        st.pop();
        while(st.peek()=='['){
            bracket+=st.peek();
            st.pop();
        }
        st.pop();
        while(Character.isDigit(st.peek())){
         //repeat the bracket digit times
         ans+=bracket.repeat(st.peek());
        }
        st.pop();
        bracket="";  //re-initialise the bracket
      }
    }

    return ans;
}
public static void main(String[] args) {
    String s = "3[a]2[bc]";
    System.out.println(Decode(s));
}
}
