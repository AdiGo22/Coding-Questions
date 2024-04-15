package JavaBasics;

public class Constructor {
    String name;
    int age;
   
    // Constructor
    public Constructor(String n, int a) {
        this.name = n;
         //assigned  values

        if(a>18){
            this.age = a;
        }else{
            System.out.println("Not Eligible to vote");
        }
    }

    public static void main(String args []){
        Constructor Person1 = new Constructor("Aditya",21);
        Constructor Person2 = new Constructor("Aryan",15);

        System.out.println("Person - 1"+Person1.name+" "+Person1.age);
        System.out.println("Person - 2"+Person2.name+" "+Person2.age);
    }
}

//constructor is initial value for object and can check for condition for the value of data , it is called when the object is initialised