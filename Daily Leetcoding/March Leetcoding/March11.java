/*This is daily leetcode starting from March 2024. So today question is  - Custom Sort String     Leetcode No.- 791  */

public class March11 {
    public static  String customString (String s , String order) {
        //from using the order , sort the s such that it aligns with the order .
        //order - "cba"  s = "abcd"   result - "cbad"

        //from the string order check if the current letter is contained in the s if yes then okay else delete.
     
        //enter all the characters of s in the array and check if c is contained in the map.
        int[] count = new int[26];

        for (char x : s.toCharArray())
            count[x - 'a']++;

        StringBuilder result = new StringBuilder();
        for (char ch : order.toCharArray()) {
            while (count[ch - 'a']-- > 0) {
                result.append(ch);
            }
        }

        // Add the characters which are not present in 'order'
        for (char ch : s.toCharArray()) {
            if (count[ch - 'a'] > 0) {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "abcd";
        String order = "cba";
        System.out.println(customString(s,order));
    }
}
