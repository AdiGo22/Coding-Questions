public class RotateMatrix {
    public static int[][] rotate (int[][]matrix) {
    //[[1,2,3],[4,5,6],[7,8,9]] --> [[7,4,1],[8,5,2],[9,6,3]]
     //1.transpose -- 2.mirror
       int temp;
     for(int i=0;i<matrix.length;i++){
        for(int j=i;j<matrix[0].length;j++){
            temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
     }//transposed


     //mirror
     for(int i=0;i<matrix.length;i++){
        int left = 0;
        int right = matrix[0].length-1;
         while(left < right) {
            temp = matrix[i][left];
            matrix[i][left] = matrix[i][right];
            matrix[i][right] = temp; 

            left++;
            right--;
         }//mirrored
     }

     //finally 90 degree cw rotated
      return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(rotate(matrix));
    }
    }