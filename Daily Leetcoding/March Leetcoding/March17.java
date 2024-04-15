/*This is daily leetcode starting from March 2024. So today question is  - Insert Interval   Leetcode No.-  57    */
import java.util.*;
public class March17 {
    public static int[][] insert (int[][]intervals , int[] newInterval)  {
     // Initialize arrays to store start and end points
     int[] start = new int[intervals.length + 1];
     int[] end = new int[intervals.length + 1];

     // Populate start and end arrays with intervals
     for (int i = 0; i < intervals.length; i++) {
         start[i] = intervals[i][0];
         end[i] = intervals[i][1];
     }

     // Insert start and end points of the new interval
     start[intervals.length] = newInterval[0];
     end[intervals.length] = newInterval[1];

     // Sort start and end arrays
     Arrays.sort(start);
     Arrays.sort(end);

     // Merge overlapping intervals
     List<int[]> mergedIntervals = new ArrayList<>();
     int startIndex = 0;
     for (int i = 0; i < start.length; i++) {
         if (i == start.length - 1 || start[i + 1] > end[i]) {
             mergedIntervals.add(new int[]{start[startIndex], end[i]});
             startIndex = i + 1;
         }
     }

     return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
 }
    public static void main(String[] args) {
        int[][] intervals = new int[][]{{1,3},{6,9}};
        int[] newInterval = new int[]{2,5};
        System.out.println(insert(intervals,newInterval));
    }
}
