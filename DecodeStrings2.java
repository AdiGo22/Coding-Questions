import java.util.*;
public class DecodeStrings2 {
    public static String decode(String s){
   Stack<Integer> numStack = new Stack<>();
   Stack<StringBuilder>strStack = new Stack<>();


   StringBuilder str = new StringBuilder();
   int num =0;

   for(char c:s.toCharArray()){
    if(Character.isDigit(c)){
      num = num*10 + c-'0';
    }else if(c == '['){
    strStack.push(str);
    str = new StringBuilder();

    numStack.push(num);
    num =0;
    }else if(c == ']'){
       StringBuilder temp = str;
       str = strStack.pop();
       int count = numStack.pop();

       while(count-->0){  // while count>0 , count--
            str.append(temp);
       }
    }else {
     str.append(c);
    }
}
    return str.toString();
}
public static void main(String[] args) {
    String s = "3[a]2[bc]";
    System.out.println(decode(s));
}
}
    

