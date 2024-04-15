package JavaBasics.Inheritance;

public class Vehicle {
    int NumberOfTyres;
    String Name;
    String Model;

    Vehicle(int NumberOfTyres, String Name, String Model){ //constructor
       this.NumberOfTyres = NumberOfTyres;
       this.Name  = Name;
       this.Model = Model;
    }

    void tyres(){
        if(NumberOfTyres>2){
            System.out.println("It is a 4 wheeler");
        }else if(NumberOfTyres ==2){
            System.out.println("It is a 2 wheeler");
        }
    }

    void NameOfVehicle(){
       System.out.print("Name"+"    "+Name);
    }

    void NameOfModel(){
        System.out.println("Model Name"+"   "+Model);
    }

    
}
