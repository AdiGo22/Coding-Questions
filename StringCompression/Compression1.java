package StringCompression;

public class Compression1 {
    /*s="aaabbcccaadef"
     * compression 1 = abcadef
     */
      
     public static String compress(String s){
        char ch[] = s.toCharArray();
        char Compressed =  ch[0];
        String CompressedSt = Compressed+"";
       int i =1;
        while(i<s.length()){
        if(ch[i]!=Compressed){
          CompressedSt+=ch[i];
          Compressed = ch[i]; 
          //compresed updated
          i++;
        }else{
        i++;
        }
    }
        
        return CompressedSt;

     }

     public static void main(String[] args) {
        String s = "aaaaaaaaaabccccccccccx";
        System.out.println(compress(s));
     }
}
