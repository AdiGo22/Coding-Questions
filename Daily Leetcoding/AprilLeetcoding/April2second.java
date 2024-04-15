package AprilLeetcoding;
import java.util.*;
public class April2second {
    public static boolean isIsomorphic(String s,  String t) {
    //using array of characters instead of map
    int[]map1 = new int[256];
    int[]map2 = new int[256];
    int n = s.length();

    Arrays.fill(map1,-1);
    Arrays.fill(map2,-1);
    //mark arrays with -1 as values.

    for(int i = 0;i<n;i++) {
        char ch1 = s.charAt(i);
        char ch2 = t.charAt(i);

        if((map1[ch1]!= -1 && map1[ch1]!= ch2) || (map2[ch2]!=-1 && map2[ch2]!=ch1)){return false;}

        map1[ch1] = ch2;
        map2[ch2] =  ch1;
     }

     return true;
}

public static void main(String[] args) {
    String s = "egg";
    String t = "add";
    System.out.println(isIsomorphic(s, t));
}

}
