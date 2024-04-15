public class GcdOfString {
    public String gcd(String str1, String str2){
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        int gcdval = gcd(str1.length(),str2.length());
        return str2.substring(0,gcdval);
        
    }
    private int gcd(int x, int y){
        if(y==0)return x;
        else return gcd(y,x%y);
    }
}