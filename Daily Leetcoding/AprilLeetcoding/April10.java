package AprilLeetcoding;

public class April10 {
    public static String RemoveKDigit (String num , int k )  {
       
                StringBuilder result = new StringBuilder(); // it will act like a stack
                int n = num.length();
                
                for(int i = 0; i < n; i++) {
                    while(result.length() > 0 && result.charAt(result.length() - 1) > num.charAt(i) && k > 0) {
                        result.deleteCharAt(result.length() - 1);
                        k--;
                    }
                    
                    if(result.length() > 0 || num.charAt(i) != '0') {
                        result.append(num.charAt(i)); // to avoid the case when we have preceding zeros
                    }
                }
                
                while(result.length() > 0 && k > 0) {
                    result.deleteCharAt(result.length() - 1);
                    k--;
                }
        
                if(result.length() == 0) {
                    return "0";
                }
                
                return result.toString();
            }
        
    public static void main(String[] args) {
        String num = "1432219";
        int k = 3;
        System.out.println(RemoveKDigit(num,k));
    }
}
