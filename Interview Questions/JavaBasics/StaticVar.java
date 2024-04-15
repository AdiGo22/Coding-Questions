package JavaBasics;

public class StaticVar {
    int eid;
    int salary;
   static  String ceo="aditya goswami";

    public void show() {
        System.out.println(eid + " : " + salary + " : " + ceo);
    }

    public static void main(String args[]) {
        StaticVar adi = new StaticVar();
        StaticVar aditya = new StaticVar();

        adi.eid = 8;
        adi.salary = 2000;
        StaticVar.ceo = "Aditya Goswami";

        aditya.eid = 10;
        aditya.salary = 4000;
       StaticVar.ceo = "Mukesh Nath SIngh";

        adi.show();
        aditya.show();
    }
}
 

//static variable is associated with the class 
//and deals with a single copy inside memory and no other copies are made all changes are made on the same copy