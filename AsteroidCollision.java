import java.util.Stack;
import java.util.*;
public class AsteroidCollision {
    public static int[] asteroidcollision(int[]asteroids){
        Stack<Integer> st = new Stack<>();
        
        for(int i=0;i<asteroids.length-1;i++){
            if(asteroids[i]*asteroids[i+1] > 0){
                st.push(asteroids[i]);
            }else if(asteroids[i]*asteroids[i+1]<0){
                st.push(Math.abs(asteroids[i]) > Math.abs(asteroids[i + 1]) ? asteroids[i] : asteroids[i + 1]);

            }
        }
        int index = st.size()-1;
        int[]res = new int[st.size()];
         while(!st.isEmpty()){
            res[index--] = st.pop();
         }

         return res;
    }
    public static void main(String[] args) {
        int[]asteroids = new int[]{5,10,-5};
       
        System.out.println(asteroidcollision(asteroids));
    }
}
