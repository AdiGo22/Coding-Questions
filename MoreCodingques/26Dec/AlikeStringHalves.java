public class AlikeStringHalves {
    public static boolean returnifalike(String s){
        //convert all of em to lower case
        s = s.toLowerCase();
        int len = s.length();
        int vowelA = 0 , vowelB = 0; 
        
        //brute force method
        String a ="";
        String b ="";

        for(int i=0;i<len/2;i++){
          a+=s.charAt(i);
        }//one half into a

        for(int i=len/2 ;i<len;i++){
            b+=s.charAt(i);
          }//one half into b
    

          for(int i =0;i<a.length();i++){
            if((a.charAt(i)=='a')||(a.charAt(i)=='e')||(a.charAt(i)=='i')||(a.charAt(i)=='o')||(a.charAt(i)=='u')){
                 vowelA++;
            }
          }

          for(int i =0;i<b.length();i++){
            if((b.charAt(i)=='a')||(b.charAt(i)=='e')||(b.charAt(i)=='i')||(b.charAt(i)=='o')||(b.charAt(i)=='u')){
                 vowelB++;
            }
          }

          //check
              
          return vowelA==vowelB;
          
    }

    public static void main(String[] args) {
        String s = "textbook";
        System.out.println(returnifalike(s));
    }
}
