public class longestprefix {
    public static String prefic(String[]str){
          //#leetcode 14
        if(str.length==0) return ""; //empty string
        String prefix = str[0];
        for(int i=0;i<str.length;i++){
            while(str[i].indexOf(prefix)!=0){ //while prefix does not start with str[i]
              prefix = prefix.substring(0,prefix.length()-1); //remove one element from back of prefix
            }
        }
        return prefix;
    }
}
