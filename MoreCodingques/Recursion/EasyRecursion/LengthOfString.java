package Recursion.EasyRecursion;

public class LengthOfString {
    public static int FindLength (String s) {
  
      if (s.equals(""))
      return 0;
  else
      return FindLength(s.substring(1)) + 1 ;
      // FindLength(s.substrign(1)) --> exuding the first index of string for every call and then adding 1 with every exudation
      //therefore , return FindLength(s.substring(1))+1 ;
    }
    public static void main(String[] args) {
        String s = "aditya";
        System.out.println(FindLength(s));
    }
}


/*
       //calculate the length of the string using recursion
        if (s.equals(""))
            return 0;
        else
            return FindLength(s.substring(1)) + 1 ;
 * 
 * 
 */