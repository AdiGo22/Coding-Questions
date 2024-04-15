import java.util.*;
public class WareHouse_Solution {
       public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String bananaWeights[] = sc.nextLine().split(" "); 
        int[] weights = new int[bananaWeights.length]; 
       
        for(int i=0;i<weights.length;i++){
            weights[i] = Integer.parseInt(bananaWeights[i]);
        }//weights will contain Banana weights splitted by whitespaces 
         int  maxWeightLimit = Integer.parseInt(sc.nextLine());

         int output = MinimumVehicles(weights,maxWeightLimit); 
         System.out.print(output);//print the output 

         sc.close();
    }

    public static int MinimumVehicles(int[]weights, int maxWeightLimit){
        List<Integer> SortedWeights = new ArrayList<>();
        for(int i:weights){
            if(i!=0){
                SortedWeights.add(i);
            }
        }
            Collections.sort(SortedWeights,Collections.reverseOrder());
            int left = 0;
            int right = SortedWeights.size()-1;
            int MinVehicles = 0;

            while(left<=right) {
                if(SortedWeights.get(left)+ SortedWeights.get(right)<=maxWeightLimit){
                    right--;
                }
                left++;
                MinVehicles++;
            }
            return MinVehicles;
        }
    }