public class SetMatrixZeroes {
    public static void SetZeroes (int[][]matrix){ 
        
        //enter into matrix and check for 0s
        boolean[] CheckRow = new boolean[matrix.length];
        boolean[] CheckCols = new boolean[matrix[0].length];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                 if(matrix[i][j] == 0){
                      CheckRow[i] = true;
                      CheckCols[j] = true;
                 }
            }
        }
        //set zeroes based on the flags
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               if(CheckRow[i] || CheckCols[j]) {
            //if it holds true for any row or column
                matrix[i][j] = 0; //set 0 for the whole element
               }
            }
        }
    }
}