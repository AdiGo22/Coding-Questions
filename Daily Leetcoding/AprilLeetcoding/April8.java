/*This is daily leetcode starting from March 2024. So today question is  - Number of Students Unable to eat lunch.    Leetcode No.- 1700     */
package AprilLeetcoding;
import java.util.*;
public class April8 {
    public static int countStudents (int[] students , int[] sandwich) {
         
        Queue<Integer> q  =  new LinkedList<>();
       int top = 0 , count = 0;
       for(int i : students) {
        q.add(i);
       }
       
       while(!q.isEmpty() && count!=q.size()) {
         if(q.peek() ==  sandwich[top]) {
             count = 0;
             top++;
             q.poll();
         }else {
             
            q.add(q.poll());
            count++;
         }
       }

       return q.size();
    }
    public static void main(String[] args) {
        int[]sandwich = {1,1,0,0};
        int[]students = {0,1,0,1};

        System.out.println(countStudents(students, sandwich));
    }
}