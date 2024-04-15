import java.util.*;
public class numberofcarries{
    public static int numberofCarries(int num1 ,int num2){
        int number1 ,number2 , digadd;
        int carry =0;
        while(num1>0 && num2>0){
           number1= carry+num1%10;
           number2 = num2%10;
           digadd = number1+number2;
           if(digadd>9){
            carry++;
           }

          //when a single digit is left no need to add the carry

          num1/=10;
           num2/=10;
        }
        return carry;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        System.out.print(numberofCarries(num1, num2));
    }
}

/* okay let me write, for this question they are also including the carry operation at the units digit but my code has 2 flaws
 and will give true output for limited test cases 
 1) flaw - i have used num1>0 && num2>0 together that is if one exhaust first loop will come out , that is if one has less number of digit than other
 2) flaw - i am adding carry with number2 that may be synatically correct but not logically 
 rather we should add the actual carry that is unit digit of both the additions(digadd)
 

 lets rectify our errors and make a new program - correctednumberofcarries.java
 
 */