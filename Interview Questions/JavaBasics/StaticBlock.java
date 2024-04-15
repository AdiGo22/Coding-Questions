package JavaBasics;

public class StaticBlock {
    //using static block

 static int a =5;
 static int b =10;

 static{
    System.out.println("This is a static block");
    b = a*5; //to check the control enters static block
 }
 public static void main(String args []){
    System.out.println("value of b"+" "+b);
 }
 
}
//since static is associated with class thus when printing result for main it points the value mentioned in static block