import java.util.*;

public class VehicleAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input1 = scanner.nextLine().split(" ");
        int N = Integer.parseInt(input1[0]);
        int M = Integer.parseInt(input1[1]);

        Map<String, int[]> passengers = new HashMap<>();
        Map<String, String> vehicles = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String[] passengerData = scanner.nextLine().split(" ");
            String name = passengerData[0];
            int x = Integer.parseInt(passengerData[1]);
            int y = Integer.parseInt(passengerData[2]);
            passengers.put(name, new int[]{x, y});
        }

        for (int i = 0; i < M; i++) {
            String[] vehicleData = scanner.nextLine().split(" ");
            String vehicle = vehicleData[0];
            int x = Integer.parseInt(vehicleData[1]);
            int y = Integer.parseInt(vehicleData[2]);
            vehicles.put(vehicle, "");
            vehicles.put(vehicle + "_coordinates", x + "," + y); // Store coordinates as String
        }

        int minimumDistance = assignVehicles(passengers, vehicles);
        System.out.print(minimumDistance);

        scanner.close();
    }

    public static int calculateDistance(int[] point1, int[] point2) {
        return Math.abs(point1[0] - point2[0]) + Math.abs(point1[1] - point2[1]);
    }

    public static int assignVehicles(Map<String, int[]> passengers, Map<String, String> vehicles) {
        Map<String, String> allocatedVehicles = new HashMap<>();
        int totalDistance = 0;

        List<String> sortedPassengers = new ArrayList<>(passengers.keySet());
        Collections.sort(sortedPassengers);

        for (String passenger : sortedPassengers) {
            int minDistance = Integer.MAX_VALUE;
            String closestVehicle = "";
            int[] passengerCoordinates = passengers.get(passenger);

            for (String vehicle : vehicles.keySet()) {
                if (vehicles.get(vehicle).isEmpty()) {
                    String[] vehicleCoords = vehicles.get(vehicle + "_coordinates").split(",");
                    int vehicleX = Integer.parseInt(vehicleCoords[0]);
                    int vehicleY = Integer.parseInt(vehicleCoords[1]);
                    int distance = calculateDistance(passengerCoordinates, new int[]{vehicleX, vehicleY});

                    if (distance < minDistance || (distance == minDistance && vehicle.compareTo(closestVehicle) < 0)) {
                        minDistance = distance;
                        closestVehicle = vehicle;
                    }
                }
            }

            allocatedVehicles.put(passenger, closestVehicle);
            vehicles.put(closestVehicle, passenger);
            totalDistance += minDistance;
        }

        return totalDistance;
    }
}
