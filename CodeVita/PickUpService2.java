import java.util.*;

public class PickUpService2 {

    static class City {
        int goods;
        int tax;
        String name;

        public City(String name, int goods, int tax) {
            this.name = name;
            this.goods = goods;
            this.tax = tax;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        List<City> connections = new ArrayList<>();

        for (int i = 0; i < N - 1; i++) {
            String[] input = scanner.nextLine().split(" ");
            String city1 = input[0];
            String city2 = input[1];
            int goods = Integer.parseInt(input[2]);
            int tax = Integer.parseInt(input[3]);

            connections.add(new City(city1, goods, tax));
            connections.add(new City(city2, goods, tax));
        }

        List<String> route = new ArrayList<>();
        int totalTax = pickUpService(N, connections.get(0).name, connections, route);

        System.out.println(String.join("-", route));
        System.out.print(totalTax);

        scanner.close();
    }

    public static int pickUpService(int N, String start, List<City> connections, List<String> route) {
        Map<String, List<City>> graph = new HashMap<>();
        Map<String, Integer> taxes = new HashMap<>();

        for (City connection : connections) {
            if (!graph.containsKey(connection.name)) {
                graph.put(connection.name, new ArrayList<>());
            }
            graph.get(connection.name).add(new City("", -1 * connection.goods, connection.tax));
            taxes.put(connection.name, connection.tax);
        }

        dfs(start, graph, route);
        int totalTax = 0;
        for (String c : route.subList(1, route.size())) {
            totalTax += taxes.getOrDefault(c, 0);
        }

        return totalTax;
    }

    public static void dfs(String city, Map<String, List<City>> graph, List<String> route) {
        route.add(city);
        if (graph.containsKey(city)) {
            for (City n : graph.get(city)) {
                dfs(n.name, graph, route);
                route.add(city);
            }
        }
    }
}
