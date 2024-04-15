import java.util.HashMap;

public class March8second {
    public static int GetLeastCommon (int[]nums1 , int[]nums2) {
        //since it is given the datas are sorted in ascending order
        //the first common element is the result
           HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums1) {
            map.put(i,map.getOrDefault(i, 0)+1); //entered the elements of nums1 into map.
        }
             
        for(int i:nums2) {
           if(map.containsKey(i)) {
            //since it is given the datas are sorted in ascending order
                  return i;
           }
        }
        //get the least common in MinCommon
        return -1;
    }
    public static void main(String[] args) {
        int[]nums1 = new int[]{1,2,3};
        int[]nums2 = new int[]{2,4};
        System.out.println(GetLeastCommon(nums1, nums2));
    }
}
