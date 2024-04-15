import java.util.*;
public class lcmadd {
    public static int add(int a, int b){
        //given it should be divisible by 3 and 5
        int sum=0;
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=a;i<=b;i++){
            if(i%15==0){
            arr.add(i);
            }
        }

        for(int i:arr){
            sum+=i;
        }
        return sum;
    }
    public static void main(String arhs []){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
         sc.close();
        System.out.print(add(a,b));
    }
    
}
