public class RottenOranges {
    public static int time(int[][] grid) {
        int time = 0;
        boolean freshOrangesExist = true;

        while (freshOrangesExist) {
            freshOrangesExist = false;
            
            // Create a copy of the grid to avoid simultaneous updates
            int[][] newGrid = new int[grid.length][grid[0].length];
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    newGrid[i][j] = grid[i][j];
                }
            }

            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == 2) {
                        if (i - 1 >= 0 && grid[i - 1][j] == 1) {
                            newGrid[i - 1][j] = 2;
                            freshOrangesExist = true;
                        }
                        if (i + 1 < grid.length && grid[i + 1][j] == 1) {
                            newGrid[i + 1][j] = 2;
                            freshOrangesExist = true;
                        }
                        if (j - 1 >= 0 && grid[i][j - 1] == 1) {
                            newGrid[i][j - 1] = 2;
                            freshOrangesExist = true;
                        }
                        if (j + 1 < grid[0].length && grid[i][j + 1] == 1) {
                            newGrid[i][j + 1] = 2;
                            freshOrangesExist = true;
                        }
                    }
                }
            }

            // Update the original grid
            grid = newGrid;

            if (freshOrangesExist) {
                time++;
            }
        }

        // Check if there are still fresh oranges left
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    return -1; // There are still fresh oranges left, so return -1
                }
            }
        }

        return time;
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        System.out.println(time(grid));
    }
}
