import java.util.*;
public class sumofdistance {
    public static float sum(int x1 , int y1 , int x2 ,int y2 , int x3, int y3){
        //dist- 1,2
        double dx12 = Math.pow((x2-x1),2);
        double dy12 = Math.pow((y2-y1),2);
        float d12 = (float)Math.sqrt(dx12+dy12);

        double dx23 = Math.pow((x2-x3),2);
        double dy23 = Math.pow((y2-y3),2);
        float d23 = (float)Math.sqrt(dx23+dy23);

        double dx13 = Math.pow((x3-x1),2);
        double dy13 = Math.pow((y3-y1),2);
        float d13 = (float)Math.sqrt(dx13+dy13);
        
     float totalsum = d12+d23+d13;

     return totalsum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
         int x2 = sc.nextInt();
          int y1 = sc.nextInt();
           int y2 = sc.nextInt();
            int x3 = sc.nextInt();
             int y3 = sc.nextInt();
                
             sc.close();
             System.out.print(sum(x1,y1,x2,y2,x3,y3));
    }
}


