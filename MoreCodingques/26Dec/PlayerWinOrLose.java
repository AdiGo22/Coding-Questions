import java.util.*;

public class PlayerWinOrLose {
    public static List<List<Integer>> winOrLose(int[][] matches) {
        // {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}}
        // {{1,2,10} , {4,5,7,8}}

        // To make a hashmap of win and lose separately
        
                Map<Integer, Integer> lost = new HashMap<>();
        
                for (int[] it : matches) {
                    int lose = it[1];
                    lost.put(lose, lost.getOrDefault(lose, 0) + 1);
                }
        
                List<Integer> notLost = new ArrayList<>();
                List<Integer> oneLos = new ArrayList<>();
        
                for (int[] it : matches) {
                    int lose = it[1];
                    int win = it[0];
        
                    if (lost.get(lose) == 1) {
                        oneLos.add(lose);
                    }
                    if (!lost.containsKey(win)) {
                        notLost.add(win);
                        lost.put(win, 2);
                    }
                }
        
                Collections.sort(notLost);
                Collections.sort(oneLos);
        
                return Arrays.asList(notLost, oneLos);
            }
        

    public static void main(String[] args) {
        int[][] matches = new int[][]{{1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5}, {4, 8}, {4, 9}, {10, 4}, {10, 9}};
        System.out.println(winOrLose(matches));
    }
}

