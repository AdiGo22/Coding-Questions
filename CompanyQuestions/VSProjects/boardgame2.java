import java.util.*;
class boardgame2
{
    public static void main(String[] args)
    {
          Scanner sc=new Scanner(System.in);
          int t=sc.nextInt();
          ArrayList<Integer> list=new ArrayList<Integer>(t);
         for(int i=0;i<t;i++)
              list.add(sc.nextInt());
          for(int i=0;i<t;i++)
              if(list.get(i)%7==1 || list.get(i)%7==0)
                   System.out.println("second");
               else 
                   System.out.println("First");
     }
}
