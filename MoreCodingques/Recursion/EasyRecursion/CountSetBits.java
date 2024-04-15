package Recursion.EasyRecursion;
/*wrong */
public class CountSetBits {
    public static int ReturnSetBitsCount (int n)  {
        //count the set bits when converting from decimal to binary
        //first convert into binary and then return the set bits count

        if(n>0) {
            return ((n%2) + 10*(ReturnSetBitsCount(n/2))); //conversion of dec to binary - 1010
        } else{
            return 0;
        }
    }
    public static void main(String[] args) {
        int n = 16;
        System.out.println(ReturnSetBitsCount(n));
    }
}
