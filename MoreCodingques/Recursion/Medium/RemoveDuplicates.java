package Recursion.Medium;

public class RemoveDuplicates {
    public static String RemoveDuplicateStrings (String s,int size) {
        //recursively remove the duplicates char in a string s

        //base case
        if(size == 1) return s;
        else{
        //check for duplicates.
        StringBuilder Result  = new StringBuilder();
        for(int i=0;i<size-1;i++) {
            if(s.charAt(i) == s.charAt(i+1)) {
                //delete the duplicates.
                Result.delete(i,i+1);
                RemoveDuplicateStrings(Result.toString(), size-Result.length());
            }         
        } 
        return RemoveDuplicateStrings(s, size);

        }
    }
    public static void main(String[] args) {
        String s = "geeksforgeeg";
        int size = s.length();

        System.out.println(RemoveDuplicateStrings(s, size));
    }
}
