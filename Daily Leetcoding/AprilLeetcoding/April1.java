/*This is daily leetcode starting from March 2024. So today question is  -     Leetcode No.-      */
package AprilLeetcoding;

public class April1 {
    public static int LengthOfLastWord (String s) {
        //to return the length of last word devoid of any space or empty.
      int len = s.length();
        if(len == 1){
            return len;
        }
         String[] characters = s.split(" ");

         return characters[characters.length-1].length();
    }
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(LengthOfLastWord(s));
    }
}
//TC - o(n) : SC - o(n)