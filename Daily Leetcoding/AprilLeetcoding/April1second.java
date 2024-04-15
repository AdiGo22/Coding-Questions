package AprilLeetcoding;

public class April1second {
    public static int findLengthOfLastWord(String s) {
  if(s==null || s.length() == 0) {return 0;}

  int  i =s.length()-1;//at the last index of sentence
  //first delete all the trailing whitespace (after last word)
   while(i>=0  && s.charAt(i)==' '){
    i--; //decrementing i till you get a word and place the index skipping all the trailing whitespaces.
   }
   int j = i;
   while(i>=0 && s.charAt(i)!=' '){
    i--; //decrementing i to reach at the first index of the last word(i) while j is still at the last index of last word.
   }

   return j-i;
}
  public static void main(String[] args) {
        String s = "aditya is a good boy                                  ";
        System.out.println(findLengthOfLastWord(s)); // Output: 3
    }
}
