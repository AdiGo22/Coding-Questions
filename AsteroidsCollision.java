import java.util.Stack;

public class AsteroidsCollision {
    public static int[] asteroidcollisions(int asteroids[]){
        Stack<Integer> st = new Stack<>();
       for(int i=0;i<asteroids.length;i++){
            //blind insertion if stack is empty of if asteroids[i] >0
            if(st.isEmpty()|| asteroids[i]>0){
                st.push(asteroids[i]);
            }else{
                while(!st.isEmpty()){
                   int top = st.peek();
                   if(top<0){
                    break; //if the peek value of stack is also negative with the upcoming array number also negative
                   }
                   int Magnitude = Math.abs(asteroids[i]);
                   if(Magnitude == top){
                    st.pop();
                    break; // if it is equal pop the existing and dont allow the upcoming
                   }
                   else if(Magnitude < top){
                    break; // if the upcoming value is less than the existing top dont allow it to enter
                   }else{
                       st.pop();
                       if(st.isEmpty()){
                        st.push(asteroids[i]);
                        break;
                       } // if the upcoming value is more than exisiting top pop the exisiting top if stack is empty enter the upcoming value
                   }
                }
            }
       }


       //spill into array

    int[] AsteroidAfterCollision = new int[st.size()];
    int index = AsteroidAfterCollision.length-1;

    while(!st.isEmpty()){
        AsteroidAfterCollision[index--] = st.pop();
    } //spilled all the values of asteroid after collision

    return AsteroidAfterCollision;
}


public static void main(String[] args) {
    int[]asteroids = new int[]{5,10,-5};
    System.out.println(asteroidcollisions(asteroids));
}
}