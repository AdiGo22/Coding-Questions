package Recursion.EasyRecursion;

public class fibbonaci {
   
        public static void PrintFibbo (int n) {   //print the actual fibbonaci
            for(int i=0;i<=n;i++){
           System.out.println(Fibbo(i));
            }
        }
        public static int Fibbo (int n) {  //actual recursive block
            if(n<=1){
                return n;  //base case
            }else{
               return Fibbo(n-1) + Fibbo(n-2); //assume for n-1 steps
              }
            }
        

    
   
        public static void main(String[] args) {
            //print the fibbonaci
            int n = 5;
           PrintFibbo(n);
        }
    
    }


    /**
     *
     */