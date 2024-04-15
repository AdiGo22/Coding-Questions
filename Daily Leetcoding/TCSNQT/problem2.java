package TCSNQT;

public class problem2 {
    public static int InterConvertBinary(int n) {
        //convert n into binary and then convert the decimal eq of conversion.
         if(n==1){ return 1;}
         if(n==0){return 0;}
         
         int Convert = 0;
        Convert= InterConvertBinary(n/2) + n%2;
        return Convert;
        
        //reconvert

    }

    public static int binarytoDecimal(int binary) {
        int decimal = 0;
        int base = 1;


        while(binary > 0 ) {
            int lastDigit = binary%10;
            binary/=10;
            decimal+=lastDigit*base;
            base*=2;
        }


        return decimal;

    }

    public static void main(String[] args) {
        
    }
}
