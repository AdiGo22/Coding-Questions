import java.util.*;
public class BinaryString {
    public static int OperationBinaryString(String str){
        //accepted string str
    if(str == null){
        return -1;
    }
    int res = str.charAt(0) -'0'; //this is done to convert string number to int 
     for(int i=1;i<str.length();){
        char prev = str.charAt(i);
        i++;

        if(prev == 'A'){
            res = res&str.charAt(i)-'0'; //prev is starting from 1st index and updated afterwards, meanwhile charAt(i) will go as 2,4,6,...
        }
        else if(prev == 'B'){
            res = (res|str.charAt(i)-'0');
        }
        else{
            res = res^str.charAt(i)-'0';
        }
        i++;//update i 

     }
     return res;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        System.out.println(OperationBinaryString( str));
    }
}