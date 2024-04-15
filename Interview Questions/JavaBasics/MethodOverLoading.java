package JavaBasics;

public class MethodOverLoading {
    //method to be overloaded

    public int add(int a , int b){
        return a+b; //fucntion to add two numbers
    }

    public int add(int a ,int b ,int c ){
        return a+b+c; //function to add 3 numbers
    }

    public int add(int a , int b, int c, int d){
        return a+b+c+d; //function to add 4 numbers
    }
    public int add(int a , int b,int c, int d ,int e ){
        return a+b+c+d+e; //function to add 4 numbers
    }

    public static void main (String args[]){
       MethodOverLoading obj = new MethodOverLoading();
       int calculate1 = obj.add(20,4);
       int calculate2 = obj.add(30,10,0);
       int calculate3 = obj.add(10,60,50,70,10);

       System.out.println(calculate1 +"  "+calculate2+"   "+calculate3);
    }
}


/*Method Overloading have same name but different in parameters
 * either you make it different by changing the data types of the parameter
 * or you make it differrent by changing the number of parameters
 * but the function signature must have to be different with the same name
 */