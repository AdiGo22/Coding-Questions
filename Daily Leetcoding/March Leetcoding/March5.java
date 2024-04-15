/*This is daily leetcode starting from March 2024. So today question is  - Minimum Length of String After Deleting Similar Ends  Leetcode No.- 1750*/

public class March5 {
    public static int MinimumLength(String s ){
       //use 2 pointer approach
       int i = 0;
       int j = s.length()-1;

       while(i<j  && s.charAt(i) == s.charAt(j)){
        char ch = s.charAt(i); //this is the character for the index i that will be traversed.
           while(i<j && s.charAt(i) == ch){
            i++;
           } //Increment the i pointer as long as the characters at position i match the stored character ch.
           while(j>=i  && s.charAt(j) == ch){
            j--;
           }//Decrement the j pointer as long as the characters at position j match the stored character ch.
       }

       //finally return the length left;
       return j-i+1;
    }
    public static void main(String[] args) {
        String s =  "aabccabba";
        System.out.println(MinimumLength(s));
    }
}