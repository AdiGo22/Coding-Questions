import java.util.*;

public class PickUpService3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        List<String[]> cons = new ArrayList<>();

        for (int i = 0; i < N - 1; i++) {
            String l = scanner.nextLine();
            String[] ls = l.split(" ");
            cons.add(new String[]{ls[0], ls[1], ls[2], ls[3]});
        }

        Map<String, List<int[]>> graph = new HashMap<>();
        Map<String, Integer> taxes = new HashMap<>();

        for (String[] con : cons) {
            String city1 = con[0];
            String city2 = con[1];
            int goods = Integer.parseInt(con[2]);
            int tax = Integer.parseInt(con[3]);

            if (!graph.containsKey(city1)) {
                graph.put(city1, new ArrayList<>());
            }

            graph.get(city1).add(new int[]{-1 * goods, tax, Integer.parseInt(city2)});
            taxes.put(city2, tax);
        }

        List<String> route = new ArrayList<>();
        dfs("StartingCity", graph, route);

        int totalTax = 0;
        for (int i = 1; i < route.size(); i++) {
            totalTax += taxes.get(route.get(i));
        }

        System.out.println(String.join("-", route));
        System.out.print(totalTax);
    }

    public static void dfs(String city, Map<String, List<int[]>> graph, List<String> route) {
        route.add(city);
        if (graph.containsKey(city)) {
            List<int[]> neighbors = graph.get(city);
            for (int[] neighbor : neighbors) {
                dfs(Integer.toString(neighbor[2]), graph, route);
                route.add(city);
            }
        }
    }
}
