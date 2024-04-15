import java.util.*;

public class WareHousechatgpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] weightsInput = scanner.nextLine().split(" ");
        int[] weights = new int[weightsInput.length];
        for (int i = 0; i < weightsInput.length; i++) {
            weights[i] = Integer.parseInt(weightsInput[i]);
        }

        int maxLimit = Integer.parseInt(scanner.nextLine());

        int result = minimumVehicles(weights, maxLimit);
        System.out.print(result);

        scanner.close();
    }

    public static int minimumVehicles(int[] weights, int maxLimit) {
        List<Integer> sortedWeights = new ArrayList<>();
        for (int weight : weights) {
            if (weight != 0) {
                sortedWeights.add(weight);
            }
        }
        Collections.sort(sortedWeights, Collections.reverseOrder());

        int left = 0;
        int right = sortedWeights.size() - 1;
        int vehicles = 0;

        while (left <= right) {
            if (sortedWeights.get(left) + sortedWeights.get(right) <= maxLimit) {
                right--;
            }
            left++;
            vehicles++;
        }

        return vehicles;
    }
}
