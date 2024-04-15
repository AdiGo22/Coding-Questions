import java.util.*;
public class palindromeinside {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
         sc.close();
        for(int i=a;i<=b;i++){
            if(isPalindrome(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static boolean isPalindrome(int n){
        int originalnum = n;
        int revnumber =0;
        while(n!=0){
            int last = n%10;
             revnumber = revnumber*10+last;
             n/=10;
        }
        return originalnum == revnumber;
    }
}

