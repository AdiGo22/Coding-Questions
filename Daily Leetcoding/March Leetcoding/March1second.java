/*This is daily leetcode starting from March 2024. So today question is  -"Maximum Odd Binary Number" - method 2*/
/* " Leetcode No.-  "2864*/
public class March1second {
    public static  String  MaximumOddBinary(String s) {
        int size = s.length();
        StringBuilder result = new StringBuilder();
        for(int i =0 ;i<size;i++) {
            result.append('0') ; //this is a default string with all  0s
        }
        int index = 0;
        for(char c : s.toCharArray()) {
            if(c == '1' ) {
                if(result.charAt(size-1)=='1') {   //if the lsb is already 1 go for maximising the other 1s
                     result.setCharAt(index, '1');
                     index++; // then set 1 according to the indexes
                }else{
                    result.setCharAt(size-1,'1'); //then make the lsb to 1.
                }
            }
        }

        return result.toString(); //return the result
    }
    public static void main(String[] args) {
        String s = "0101";
        System.out.println(MaximumOddBinary(s));
    }
}
