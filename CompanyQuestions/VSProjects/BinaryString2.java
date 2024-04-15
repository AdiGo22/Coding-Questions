import java.util.*;
public class BinaryString2 {
    public static int OperationBinaryString(String str){
      // str.toUpperCase(); //cpnverted all to uppercase
        if(str == null) {
            return -1;
        }
        int len = str.length();

        int res = str.charAt(0)-'0'; //result (res) will be updated 
       
        for(int i=1;i<len;i+=2){
          int digit = str.charAt(i+1) -'0';
            if(str.charAt(i) == 'A'){
              res&=digit;
            }else if(str.charAt(i) == 'B'){
                res|=digit;
            }else res^=digit;
        }

        return res;
    }
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        sc.close();
        System.out.println(OperationBinaryString(str)) ;
    }
        
    }

