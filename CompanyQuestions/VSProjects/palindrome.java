//print palindrome numbers within the range of upper limit and lower limit

import java.util.*;
public class palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //accept the upper and lower limits
       
        int lower = sc.nextInt();
         int upper = sc.nextInt();
        //to be made a boolean function isPalindrome that returns true or false regarding condition

        sc.close();
        for(int i=lower;i<=upper;i++){
            if(isPalindrome(i)){   //if it holds true
            System.out.print(i +" " ); //print those i with matching conditions
            }
        }
    }

    public static boolean isPalindrome(int number) {
        int originalnum = number;
        int revnumber = 0;
        while(number!=0){
            int digit = number%10;
            revnumber=revnumber*10+digit;
            number/=10;
        }
        return originalnum == revnumber;
    }
}