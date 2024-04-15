import java.util.*;
public class Accenture3{
    public static int diffofsum(int n ,int m){
        //1 to m range , n - num div
        int sum1=0,sum2=0;

        for(int i=1;i<=m;i++){
            if(i%n==0){
                sum1+=i;
            }else{
                sum2+=i;
            }
        }
            return Math.abs(sum2-sum1);
        }

        public static void main(String args []){
            Scanner sc = new Scanner(System.in);
            int n  = sc.nextInt();
            int m = sc.nextInt();
            sc.close();
            System.out.println(diffofsum(n,m));
        }
    }


