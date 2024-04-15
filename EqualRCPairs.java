import java.util.HashSet;

public class EqualRCPairs{
    public static int equalPairs(int[][] grid){
        //make 2 hashmaps store row and column each in maps 

        HashSet<int[]> RowSet = new HashSet<>();
        HashSet<int[]> ColumnSet= new HashSet<>();

        for(int i=0;i<grid.length;i++){
           int[] Row = grid[i].clone();
           RowSet.add(Row);
        }
        
        for(int j=0;j<grid[0].length;j++){
            int[]Column = new int[grid.length];
            for(int i=0;i<grid.length;i++){
                Column[i] = grid[i][j];
            }
            ColumnSet.add(Column);
        }

        int count=0;
        for(int[]Row:RowSet){
            if(ColumnSet.contains(Row)){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[][] grid = new int[][]{{3,2,1},{1,7,6},{2,7,7}};
        System.out.println(equalPairs(grid));
    }
    
}