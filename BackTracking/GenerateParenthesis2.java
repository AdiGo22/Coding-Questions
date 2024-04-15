package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis2 {
    class Solution {
    public List<String> generateParenthesis(int n) {
      List<String> para = new ArrayList();
      generate("(",1,0,para,n); 
      return para; 
    }
    void generate(String current , int open, int close,List<String> para,int n){
        
        if(current.length()==2*n){
            para.add(current);
            return;
        }


        if(open<n){
            generate(current+"(",open+1,close,para,n);
        }
        if(close<open){
            generate(current+")",open,close+1,para,n);
        }
    }
}
}
