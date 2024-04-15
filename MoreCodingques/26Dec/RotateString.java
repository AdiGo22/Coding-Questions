
public class RotateString {
    public static boolean rotation (String s , String goal) {
      //s = "abcde", goal = "cdeab" s from goal 
       return (s.length() == goal.length()  && (s+s).contains(goal));
    } 
      /*The intuition is that if goal is a rotation of s, it will be present in the concatenated string.
       This is because any rotation of s is essentially a circular shift,
        and concatenating s with itself captures all possible rotations. */
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rotation(s, goal));
    }
    
}
