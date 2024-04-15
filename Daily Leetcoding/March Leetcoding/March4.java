/*This is daily leetcode starting from March 2024. So today question is  - "BagOfTokens"   Leetcode No.- 948  */
import java.util.*;
public class March4 {
    public static int BagOfTokenScore (int[]tokens , int power) {
        int i = 0;
        int j = tokens.length-1;
        int score = 0;
        int maxScore =  0;
        Arrays.sort(tokens);

        while(i<=j) {
           if(power >= tokens[i]){
            power-=tokens[i];
            score++;
            i++;
            maxScore = Math.max(maxScore,score);
           }
           else if(score >=1) {
            power+=tokens[j];
            score--;
            j--;
           }
           else{
            //no token is played , get out of the loop
            break;
           }  
        }
        return maxScore;
    }
    public static void main(String[] args) {
        int[]tokens = new int[]{100,200,300,400};
        int power = 200;
        System.out.println(BagOfTokenScore(tokens, power));
    }
}
