import java.util.*;
public class correctednumberofcarries {
    //unit digits carrries is also taken

    public static int carries(int num1, int num2){
        
        int add=0;
        int carry=0 ,count=0;
        int n1,n2;
     while(num1!=0 && num2!=0){
        n1 = carry+num1%10;
        n2 = num2%10;
       
       add= n1+n2;

       if(add>9){
       carry = add/10;
       count++;
       }

        num1/=10;
        num2/=10; //updated

    }
    return count;
    }

    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    sc.close();
    System.out.print(carries(n1,n2));
    }
}
/* samee problem  */



     
