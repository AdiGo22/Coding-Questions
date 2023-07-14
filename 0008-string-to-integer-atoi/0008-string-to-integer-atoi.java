class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int n = s.length();

        while (i < n && Character.isWhitespace(s.charAt(i))) {
            i++;
        } //skipping the whitespaces

        int sign = 1;
        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        } //if expected a sign make it understand what the sign is and increment the control

        int num = 0;
        while (i < n && Character.isDigit(s.charAt(i))) { //if character.isDigit
            int digit = s.charAt(i) - '0'; //extractinf digits from the string
            if (num > (Integer.MAX_VALUE - digit) / 10) { //analysing the place values
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = num * 10 + digit;
            i++;
        }

        num *= sign;

        return num;
    }
} 