public class RottenOranges2 {
    public static int time(int[][] grid){ 
        int time = 0;
        boolean freshOrangespresent = true;
           
        while(freshOrangespresent){
            freshOrangespresent = false;//written false as default will be true depending on the conditions
        //make an extra copy for grid
        int[][] newgrid = new int[grid.length][grid[0].length];
        //traverse inside grid

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                newgrid[i][j] = grid[i][j]; //made copy 
            }
        }

        //entering into elements of grid
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 2){
                    if(i-1>=0  && grid[i-1][j]==1){
                        grid[i-1][j] = 2;
                        freshOrangespresent = true;
                    }
                    if(i+1<grid.length  && grid[i+1][j]==1){
                        grid[i+1][j] = 2;
                        freshOrangespresent = true;
                    }
                    if(j-1>=0  && grid[i][j-1]==1){
                        grid[i][j-1] = 2;
                        freshOrangespresent = true;
                    }
                    if(j+1<grid[0].length  && grid[i][j+1]==1){
                        grid[i][j+1] = 2;
                        freshOrangespresent = true;
                    }
                }
            }
        }

        //update the copy
        grid = newgrid;

          if(freshOrangespresent){
            time++;
           }
        }//end of while

        //if any fresh orange is left return -1;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    return -1;
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
