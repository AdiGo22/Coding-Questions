
import java.util.Stack;

public class RemoveStar {
    public static String remove(String s){
       
        String answer="";
    Stack<Character> st = new Stack<>();
  for(int i=0;i<s.length();i++){
    if(s.charAt(i)!='*'){
        st.push(s.charAt(i));
    }else{
        st.pop();
    }
  }

  //extract

  char[]res = new char[st.size()];
  for(int i=0;i<res.length;i++){
    res[i]=st.peek();
    st.pop();
  }//result stored

  for(int i=res.length-1;i>=0;i--){
    answer+=res[i];
  }
      return answer;
  }


  public static void main(String[] args) {
    String s = "erase*****";
    System.out.println(remove(s));
    
  }

}
