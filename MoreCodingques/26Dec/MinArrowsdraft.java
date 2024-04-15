import java.util.*;

public class MinArrowsdraft {
    public static int MinimumNumber(int[][] points) {
        // points - {{1,2},{2,3},{3,4},{4,5}} , answer = 2;
        // 1. sort
        // 2. merge all continuous
        // 3. length of array

        Arrays.sort(points, Comparator.comparingInt(a -> a[0]));

        HashMap<Integer, Integer> balloons = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>(); // result list

        for (int i = 0; i < points.length; i++) {
            balloons.put(points[i][0], points[i][1]); // made a hashmap of i,0 and i,1 values
        }

        // relation between maps

        for (Map.Entry<Integer, Integer> entry : balloons.entrySet()) {
            Integer currentKey = entry.getKey();
            Integer currentVal = entry.getValue();

            // check if next key
            if (balloons.containsKey(currentKey + 1)) {
                Integer nextKey = currentKey + 1;
                Integer nextVal = balloons.get(nextKey);

                // relation
                if (currentVal >= nextVal) {
                    list.add(nextVal);
                }
            }
        }

        return list.size() + 1; // Adding 1 to account for the last balloon
    }

    public static void main(String[] args) {
        int[][] points = new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        System.out.println(MinimumNumber(points));
    }
}
