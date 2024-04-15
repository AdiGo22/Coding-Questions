import java.util.*;
public class LongestIncSub2 {
    public static int Longest (int[] nums ) {
        //{10,9,2,5,3,7,101,18}
             if(nums.length == 0  || nums == null) {return 0;}
             Stack <Integer> st = new Stack<>();
             st.push(nums[0]);

             for(int i=1;i<nums.length;i++){
                if(st.peek() < nums[i]){
                    st.push(nums[i]);
                }else{
                    //use binary search to replace the correct positions
                    int start = 0, end = st.size()-1;
                    while(start<end) {
                        int mid = start + (end - start)/2;
                        if(st.get(mid) < nums[i]){
                            start = mid+1;
                        }else{
                            end = mid;
                        }
                    }
                        st.set(start,nums[i]);
                    }
                }
            
                    return st.size();
                }
             

    public static void main(String[] args) {
        int[] nums = new int[] {10,9,2,5,3,7,101,18};
        System.out.println(Longest(nums));
    }
}
