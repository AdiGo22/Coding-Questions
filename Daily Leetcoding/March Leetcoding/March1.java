/*this is daily leetcode starting from March 2024. 
So today question is  - Maximum Odd Binary Number  
" Leetcode No.-  "2864    */
public class March1 {
    public static String MaximumOddBinary (String s ) {
      int size = s.length();
      StringBuilder FinalString = new StringBuilder();
      for(int i =0;i<size;i++) {
        FinalString.append('0'); //made a default string with 0s in number of size of s
      } 

      //now count the number of ones in s 
      int CountOnes = 0;
      for(int i=0;i<size;i++) {
        if(s.charAt(i) == '1') {
            CountOnes++;
        }
      }
        //now set the ones into the final string
        int index =  0;
        while(CountOnes >1) {
            FinalString.setCharAt(index, '1'); //setting 1 from the index into the final string
            index++; //increment the count of index

            CountOnes--; 
        }

        //also set the LSB to 1 always 
        FinalString.setCharAt(size-1,'1');

        return FinalString.toString(); //return the final string
      }

      public static void main(String[] args) {
        String s = "0101";
        System.out.println(MaximumOddBinary(s));
      }
    }
