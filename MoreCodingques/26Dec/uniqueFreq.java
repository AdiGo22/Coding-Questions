import java.util.*;
public class uniqueFreq {
    public static boolean checkUnique (int[]arr){
        //make a hashhmap and check the unique freq
          
        HashMap<Integer,Integer> Freq = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            Freq.put(arr[i],Freq.getOrDefault(arr[i],0)+1);
          //made a freq chart in hashmap
        }

        //to check if anyone has repeated freq
        //make one more hashmap for freq counts and check if all freqcount =1 

        HashMap<Integer,Integer> FreqCount = new HashMap<>();
        for(int i: Freq.values()){
            FreqCount.put(i,FreqCount.getOrDefault(i, 0)+1);
        }

        //check if all the freq count value is 1 
        for(int i:FreqCount.keySet()){
            if(FreqCount.get(i)!=1){
                return false;
            }
            }
            return true;
        }
        

    public static void main(String[] args) {
        int[]arr = new int[]{1,2};
        System.out.println(checkUnique(arr));
    }
}
