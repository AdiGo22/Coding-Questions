import java.util.*;

public class SoloRider {
    public static void main(String args[] ){
        Scanner sc = new Scanner (System.in);
        
        String[] input1= sc.nextLine().split(" ");
        int N = Integer.parseInt(input1[0]); 
        int M = Integer.parseInt(input1[1]);

        Map<String , int[]> Passengers = new HashMap<>();
        Map<String , String> Vehicles = new HashMap<>();

        for(int i=0;i<N;i++){
            String[] PassengersName = sc.nextLine().split(" ");
            String Names = PassengersName[0];
            int xCordinate = Integer.parseInt(PassengersName[1]);
            int yCordinate = Integer.parseInt(PassengersName[2]);

            Passengers.put(Names, new int[]{xCordinate,yCordinate});
        }

        for(int i=0;i<M;i++){
            String[] VehicleName = sc.nextLine().split(" ");
            String Vehicle = VehicleName[0];
            int xCordinate = Integer.parseInt(VehicleName[1]);
           int yCordinate = Integer.parseInt(VehicleName[2]); 

           Vehicles.put(Vehicle,"");
           Vehicles.put(Vehicle + "_coordinates", xCordinate + "," + yCordinate); // Store coordinates as String
        }

        int minDistance = TrackVehicle(Passengers,Vehicles);
        System.out.print(minDistance);
        sc.close();
    }

    public static int calculateDistance(int[] position1, int[]position2){
        return Math.abs(position1[0] - position2[0]) + Math.abs(position1[1] - position2[1]);
    }

    public static int TrackVehicle(Map<String,int[]>Passengers,Map<String,String>Vehicles) {
        Map<String,String> AssignedVehicles = new HashMap<>();
        int TotalDist = 0;

        List<String> sortedPassengers = new ArrayList<>((Passengers.keySet()));
        Collections.sort(sortedPassengers);


        for(String passenger : sortedPassengers){
            int minDistance = Integer.MAX_VALUE;
            String closestVehicle="";

            int[]Coordinates = Passengers.get(passenger);



            for(String vehicle: Vehicles.keySet()){
                if(Vehicles.get(vehicle).isEmpty()){
                    String[] VehicleCords = Vehicles.get(vehicle + "_coordinates").split(",");
                int VehicleX = Integer.parseInt(VehicleCords[0]);
                int VehicleY = Integer.parseInt(VehicleCords[1]);

                int Dist = calculateDistance(Coordinates, new int[]{VehicleX, VehicleY});
              
                if(Dist<minDistance || (Dist == minDistance && vehicle.compareTo(closestVehicle)<0)){
                    minDistance = Dist;
                    closestVehicle = vehicle;
                }
            }
            }

            AssignedVehicles.put(passenger,closestVehicle);
            Vehicles.put(closestVehicle,passenger);
            TotalDist+=minDistance;
        }

        return TotalDist;
    }
}
