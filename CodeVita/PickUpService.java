import java.util.*;

public class PickUpService {
    static class City {
        int goods;
        int tax;
        String nextCity;

        public City(int goods, int tax, String nextCity) {
            this.goods = goods;
            this.tax = tax;
            this.nextCity = nextCity;
        }
    }

    static Map<String, List<City>> graph = new HashMap<>();
    static Map<String, Integer> taxes = new HashMap<>();
    static List<String> route = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < N - 1; i++) {
            String[] connection = scanner.nextLine().split(" ");
            String city1 = connection[0];
            String city2 = connection[1];
            int goods = Integer.parseInt(connection[2]);
            int tax = Integer.parseInt(connection[3]);

            if (!graph.containsKey(city1)) {
                graph.put(city1, new ArrayList<>());
            }
            graph.get(city1).add(new City(-1 * goods, tax, city2));
            taxes.put(city2, tax);
        }

        List<String[]> cons = new ArrayList<>();
        for (int i = 0; i < N - 1; i++) {
            String[] ls = scanner.nextLine().split(" ");
            cons.add(ls);
        }

        List<String> ans = pickUpService(N, cons.get(0)[0], cons);
        int t = calculateTotalTax(ans);

        System.out.println(String.join("-", ans));
        System.out.print(t);

        scanner.close();
    }

    static List<String> pickUpService(int N, String start, List<String[]> connections) {
        dfs(start);
        return route;
    }

    static void dfs(String city) {
        route.add(city);
        List<City> cities = graph.getOrDefault(city, new ArrayList<>());
        cities.sort(Comparator.comparingInt(a -> a.goods));

        for (City n : cities) {
            dfs(n.nextCity);
            route.add(city);
        }
    }

    static int calculateTotalTax(List<String> route) {
        int totalTax = 0;
        for (String c : route.subList(1, route.size())) {
            totalTax += taxes.getOrDefault(c, 0);
        }
        return totalTax;
    }
}

