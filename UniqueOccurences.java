import java.util.*;


public class UniqueOccurences {
    public static boolean unique(int[]arr){
         
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }//hashmap filled with its frequencies
        
        HashMap<Integer,Integer> freqCount = new HashMap<>();
            
          
        for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
             if(freqCount.containsKey(entry.getValue())){
            freqCount.put(entry.getValue(),freqCount.get(entry.getValue())+1);
             }
             else{
                freqCount.put(entry.getValue(),1);
             }

            }


            for(Map.Entry<Integer,Integer> check : freqCount.entrySet()){
                if(check.getValue()>1){
                    return false;
                }
                }
    



                    return true;
        }



                  public static void main(String[] args) {
                    int[] arr = new int[]{-3,0,1,-3,1,1,1,-3,10,0};
                    System.out.println(unique(arr));
                  }
                }
    

