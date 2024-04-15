package Queue;
import java.util.*;
public class SandwichStudents {
    public int sandwich(int[] students , int[] sandwich) {
     Queue<Integer> q = new LinkedList<>(); //queue is for students
     Stack<Integer> st = new Stack<>(); //stack is for sandwich
     int N = students.length;
     for(int i=0;i<N;i++){
        st.push(sandwich[i]);
     }
     for(int i=0;i<N;i++){
        q.add(students[i]);
     }
       int count = 0;
       while(!q.isEmpty() && count<N){
     if(st.peek() == q.peek()){
        st.pop();
        q.poll();
        count++;
     } else if(st.peek()!=q.peek()){
            q.offer(q.peek());
            q.poll(); //removed the existing element and added it to its tail
     }
       

        return N-count;
     }
    }
    
}
