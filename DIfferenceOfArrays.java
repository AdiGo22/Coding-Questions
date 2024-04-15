import java.util.*;

public class DIfferenceOfArrays {
    public static List<List<Integer>> findDiff(int[]nums1, int[]nums2){
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int i:nums1){
           set1.add(i);
        }

        for(int i:nums2){
            set2.add(i);
        }

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        
        for (int i : nums1) {
            if (!set2.contains(i)) {
                list1.add(i);
            }
        }

        for (int i : nums2) {
            if (!set1.contains(i)) {
                list2.add(i);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(list1);
        result.add(list2);

        return result;
    }

public static void main(String[] args) {
    int[]nums1 = new int[]{1,2,3};
    int[]nums2 = new int[]{2,4,6};

    System.out.println(findDiff(nums1,nums2));
}
}
