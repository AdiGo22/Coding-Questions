//Leetcode 455
import java.util.*;
public class AssignCookies2 {
    public static int greed (int[] g, int []s) {
        //g[] = {1,2,3}  , s[] = {1,1}   o/p =1 
       Arrays.sort(g);
       Arrays.sort(s); 
       
       int g_pointer = 0; 
       int s_pointer = 0; 

       while(g_pointer < g.length && s_pointer <s.length ){
        if(g[g_pointer] <= s[s_pointer]) {
            g_pointer++;
            s_pointer++;
        }else{
            s_pointer++;
        }
       }
       return g_pointer;
    }
    public static void main(String[] args) {
        int[]g = new int[]{1,2,3};
        int []s = new int[] {1,1};

        System.out.println(greed(g, s));
    }
}
