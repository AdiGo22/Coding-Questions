package JavaBasics.Inheritance;

public class Car extends Vehicle {

    Car(int NumberOfTyres, String Name, String Model) {
        super(NumberOfTyres, Name, Model);
       this.Name= Name;
       this.NumberOfTyres = NumberOfTyres;
       this.Model = Model;
    } 
      
    }
    

