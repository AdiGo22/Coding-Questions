import java.util.*;
public class replaceallch{
  public static void replacecharacter(String s, int n, char ch1, char ch2){
  char[]str = s.toCharArray();
  for(int i=0;i<n;i++){
    if(str[i]==ch1){
        str[i] = ch2;
    }else if(str[i]==ch2){
        str[i] = ch1;
    }
    else{
        str[i] = s.charAt(i);
    }
  }
  System.out.print(str);
  }

   public static void main(String args[]){

    
    char c1,c2;
    Scanner sc= new Scanner(System.in);
    String input = sc.nextLine();

     c1 = sc.next().charAt(0);
     c2 = sc.next().charAt(0);
     sc.close();
  replacecharacter(input, input.length(), c1, c2);
   }
   }
