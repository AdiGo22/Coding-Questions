public class Employee {
   int eid;
   int salary;
   static String ceo = "goswami"; //data of class employee

 public static void main(String[] args) {
    Employee adi = new Employee();
    Employee aditya = new Employee();

    adi.eid = 7;
    adi.salary = 5000;
   adi.ceo ="go";

    aditya.eid = 10;
    aditya.salary = 2000;
    

    System.out.print("ceo"+ adi.ceo);
 }

 }

