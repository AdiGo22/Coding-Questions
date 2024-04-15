package JavaBasics.Inheritance;

public class Bike extends Vehicle {
    Bike(int NumberOfTyres, String Name, String Model){
        super(NumberOfTyres, Name, Model);
        this.NumberOfTyres = NumberOfTyres;
        this.Name = Name;
        this.Model = Model;
    }
}
