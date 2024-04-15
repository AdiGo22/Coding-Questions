package JavaBasics.Inheritance;

public class InheritanceMain {
    public static void main(String args []){
         Vehicle myVehicle = new Vehicle(4, "Generic Vehicle", "Generic Model");
        Bike myBike = new Bike(2, "Honda Bike", "CBR 1000RR");
        Car myCar = new Car(4, "Toyota Car", "Camry");

            // Call methods to display information
        myVehicle.NameOfVehicle();
        myVehicle.NameOfModel();
        myVehicle.tyres();
        
        myBike.NameOfVehicle();
        myBike.NameOfModel();
        myBike.tyres();

        myCar.NameOfVehicle();
        myCar.NameOfModel();
        myCar.tyres();
    }
}


