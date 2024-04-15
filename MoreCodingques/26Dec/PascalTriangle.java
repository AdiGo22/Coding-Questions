import java.util.*;
 public class PascalTriangle {
        public static List<List<Integer>> generatePascalTriangle(int numRows) {
            
            List<List<Integer>> triangle = new ArrayList<>();
    
            if (numRows == 0) {
                return triangle;
            }
    
            // Generate the first row with a single element 1
            List<Integer> firstRow = new ArrayList<>();
            firstRow.add(1);
            triangle.add(firstRow);
    
            // Generate subsequent rows based on the previous row
            for (int rowNum = 1; rowNum < numRows; rowNum++) {
                List<Integer> prevRow = triangle.get(rowNum - 1);
                List<Integer> row = new ArrayList<>();
    
                // Each row starts and ends with 1
                row.add(1);
    
                // Fill the middle elements of the row
                for (int j = 1; j < rowNum; j++) {
                    row.add(prevRow.get(j - 1) + prevRow.get(j));
                }
    
                // Last element of the row is 1
                row.add(1);
    
                triangle.add(row);
            }
    
            return triangle;
        }
    
    
    public static void main(String[] args) {
        int numRows = 5;
        System.out.println(generatePascalTriangle(numRows));
    }
}
