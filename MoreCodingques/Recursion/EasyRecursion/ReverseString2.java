package Recursion.EasyRecursion;

public class ReverseString2 {
    //this is another approach that uses StringBuilder with recursion
    
    public static String Reverse (String s , int len) {
        
          if(len>0) {
            StringBuilder reversed = new StringBuilder();
           reversed.append(s.charAt(len-1)).append(Reverse(s,len-1));
           //finally return into the string
           return reversed.toString();

          }else{
            return "";
          }
    }
    public static void main(String[] args) {
        String s = "aditya";
        System.out.println(Reverse(s, s.length()));
    }
}


