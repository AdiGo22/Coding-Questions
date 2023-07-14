class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) return s;

        int left = 0, right = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandFromCenter(s, i, i);   // handle odd length case
            int len2 = expandFromCenter(s, i, i+1); // handle even length case
            int len = Math.max(len1, len2);

            if (right-left +1 < len) {
                left = i - (len-1)/2; //mddle indices
                right = i + (len)/2;
            }
        }

        return s.substring(left, right+1);
    }

    /**
    Returns the start and end indices of the palindromic substring
    with middle indices equal to i and j
    @param s : parent string
    @param i : middle index of the substring of which the length is to be calculated
    @param j : middle index of substring; for odd lengths - i == j, for even lengths - i+1 = j
    @return : max. length of palindromic substring
     */
    int expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        // After the loop has terminated, left and right are outside the palindromic substring
        // hence, subtract 2 to get length of substring
        return (right - left + 1) - 2;
    }


}