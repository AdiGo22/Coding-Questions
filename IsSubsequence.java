public class IsSubsequence {
        public boolean isSubsequence(String s, String t) {
            int len = t.length();
           int j =0;
           for(int i=0;i<len;i++){
            if(j<s.length() && t.charAt(i)== s.charAt(j)){
                j++;
            }
           }
        return j==s.length();
        }
    }