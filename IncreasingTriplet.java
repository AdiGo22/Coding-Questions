import java.util.*;
public class IncreasingTriplet {
    public boolean increasing (int[] nums){
        int start =0,mid=0,end=0;
        boolean flag = false;

       List<Integer> list =new ArrayList<>();
       while(start<nums.length){
            //make a triad
          mid = start+1;
          end = mid+1;
          list.add(start);
          list.add(mid);
          list.add(end);
    

          if(start<mid &&  mid<end && start<end){
            flag = true;
            list.clear();
          }else{
            flag = false;
            list.clear();
          }

          start++;
        }
    
    return flag;
}
}
