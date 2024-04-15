import java.util.*;
public class Warehouseerror {
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

    public static int MinimumVehicles(int[] weights, int maxWeightLimit){
        //sort the array to consider bananas on their weights
        Arrays.sort(weights);
        
        //mark the pointers
        int start = 0 , end = weights.length-1 , MinVehicle = 0;
        while(start<=end) {
          
                if(start == end){
                    MinVehicle++; 
                    break; //if start and end are on the same position increment the count for Minimum Vehicle and break the flow
                }

                if(weights[start]+ weights[end]<=maxWeightLimit){
                     start++;
                }
                
                    end--;
                    MinVehicle++; //increment minVehicle count for all value either pair or single weight
                
        }

        return MinVehicle;
    }
}
