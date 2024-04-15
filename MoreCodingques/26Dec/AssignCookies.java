//leetcode 455
import java.util.*;
public class AssignCookies {
    public static int greed (int[] g , int[] s) {
 //g - {1,2,3}  , s - {1,1};

   Arrays.sort(g);
   Arrays.sort(s);

   int cookieIndex  = 0; 
   int contentChildren = 0;

   while(cookieIndex <  s.length && contentChildren <g.length) {
    if(s[cookieIndex] >= g[cookieIndex]){
        contentChildren++;
    }
    cookieIndex++;
   }
   return contentChildren;
}
 public static void main(String[] args) {
        int[]g = new int[]{1,2,3};
        int []s = new int[] {3};

        System.out.println(greed(g, s));
    }

}