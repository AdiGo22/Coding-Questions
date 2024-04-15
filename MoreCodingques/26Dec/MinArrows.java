import java.util.*;
public class MinArrows {
    public static int FindMinimumArrows(int[][]points) {
      
        Arrays.sort(points,Comparator.comparingInt((int[]v)->v[1])); //

            int count = 1;
            int LastEndPoint = points[0][1];
            
            for(int i=1;i<points.length;i++){
                int CurrStartPoint = points[i][0];

                if(CurrStartPoint > LastEndPoint){
                    count++;
                    LastEndPoint = points[i][1];
                }
            }
               
         return count;
        }
        public static void main(String[] args) {
            int[][]points = new int[][]{{1,2},{2,3},{3,4},{4,5}};
            System.out.println(FindMinimumArrows(points));
        }
    }
