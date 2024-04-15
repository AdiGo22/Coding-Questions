package twopointers;

public class issubsequence {
    //using 2 pointers
    public boolean isSubSequence(String s, String t){
        int sp =0;
        int tp =0;
        if(s.length()==0)return true;
        while(tp<t.length()){
            if(t.charAt(tp)==s.charAt(sp)){
                sp++;
            if(sp == s.length())
             return true;
            }//if sp reached s.length at the last while checking
            tp++;
        }
        return false;
    }
}
