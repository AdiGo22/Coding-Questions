package twopointers;
//Leetcode 125
public class validpalindrome {
    public static boolean palindromecheck(String s){
        int left =0;
        int right = s.length()-1;//2 pointers left and right alloted
        while(left<right){
            char leftchar = Character.toLowerCase(s.charAt(left));
            char rightchar = Character.toLowerCase(s.charAt(right)); //partticularly converting all left and right char into lowercase

            if(!Character.isLetterOrDigit(leftchar)){
                left++; //if current is not check for next left (left++);
            }else if(!Character.isLetterOrDigit(rightchar)){
                right--;///same for right index
            }
            //all converted into alphanumeric and checked for left and right
            else if (leftchar!=rightchar){  //palindrome check

                return false; //if it is not equal (not palindrome)
            }else{
                left++;
                right--; //do it till it gets equal and is inside the left<right
            }
        }
        return true;
    }
}
