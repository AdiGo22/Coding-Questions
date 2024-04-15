import java.util.*;
public class lengthoflast {
    //leetcode 58
    public static int length(String s){
     String clean = s.replaceAll("//s+"," "); //replace all kind of spaces with just one space
     String str[] = clean.split(" ");//splitted partly according to space
     return (str[str.length-1]).length();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    System.out.println(length(s));
    sc.close();
    }
}
