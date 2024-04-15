public class SetMatrix {
   public static int [][] matrixSet(int[][] matrix) {
    //if any element is zero then make whole row and col zero

    //make 2 boolean flags and check which element is zero
    boolean[] checkRow = new boolean[matrix.length];
    boolean[] checkCol = new boolean[matrix.length];

    for(int i=0;i<matrix.length;i++){
        for(int j=i;j<matrix[0].length;j++){
             if(matrix[i][j] == 0) {
                checkRow[i] = true;
                checkCol[j] = true; //mark them
             }
        }
    }

    //wherever there is a true make it zero
    for(int i=0;i<matrix.length;i++){
         for(int j=0;j<matrix[0].length;j++){
              if(checkCol[j]||checkRow[i]){
                matrix[i][j] = 0;
              }
         }
    }

    return matrix;
   }
}
