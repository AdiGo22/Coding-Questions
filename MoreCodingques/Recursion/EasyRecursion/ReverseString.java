package Recursion.EasyRecursion;

public class ReverseString {
    public static String Reverse (String s , int len) {
       String rev = ""; //make a dummy string
       if(len <=1) return "";
       else{
        return (rev+=s.charAt(len-1)+Reverse(s,len-1));
       }
    }
    public static void main(String[] args) {
        String s = "aditya Goswami is a good boy";
        System.out.println(Reverse(s, s.length()));
    }
}


