import java.util.*;

public class PlayerWinOrLose3 {
    public static List<List<Integer>> winOrLose(int[][] matches) {
        // {1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}
        // {1,2,10} , {4,5,7,8}

        // To make a hashmap of win and lose separately
        HashMap<Integer, Integer> Winners = new HashMap<>();
        HashMap<Integer, Integer> Losers = new HashMap<>();

        for (int i = 0; i < matches.length; i++) {
            // Players who have not lost any matches
            Winners.put(matches[i][0], Winners.getOrDefault(matches[i][0], 0) + 1);

            // Players who have lost exactly one match
            Losers.put(matches[i][1], Losers.getOrDefault(matches[i][1], 0) + 1);
        }

        List<List<Integer>> Result = new ArrayList<>();

        // Not lost any -> should not contain in losers from winners
        List<Integer> NotLostAny = new ArrayList<>();
        for (int key : Winners.keySet()) {
            if (!Losers.containsKey(key)) {
                NotLostAny.add(key);
            }
        }
        Result.add(NotLostAny);

        // Lost exactly one match -> should not contain in winners from losers and also freq in losers == 1(must)
        List<Integer> LostOne = new ArrayList<>();
        for (int key : Losers.keySet()) {
            if (!Winners.containsKey(key) && Losers.get(key) == 1) {
                LostOne.add(key);
            }
        }
        Result.add(LostOne);

        return Result;
    }

    public static void main(String[] args) {
        int[][] matches = new int[][]{{2,3},{1,3},{5,4},{6,4}};
        System.out.println(winOrLose(matches));
    }
}
