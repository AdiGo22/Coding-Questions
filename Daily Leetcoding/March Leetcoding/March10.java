/*This is daily leetcode starting from March 2024. So today question is  - Intersection of two arrays Leetcode No.- 349  */
import java.util.HashSet;

public class March10 {
    public static int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> set1 = new HashSet<>();
    HashSet<Integer> set2 = new HashSet<>();

    for(int i:nums1) {
        set1.add(i);
        //adding all the elements of num1 into set
    }
    for(int i:nums2) {
        if(set1.contains(i)) {
            set2.add(i); //if it contains add them into the second set mantaining the individuality
        }
    }

    //convert hashset into array
    int[] intersection = new int[set2.size()];
    int index = 0;
    for(int i:set2) {
        intersection[index++] = i;
    }

    return intersection;
}




    public static void main(String[] args) {
       int[] nums1 = {4,9,5};
       int[] nums2 = {9,4,9,8,4};
       System.out.println(intersection(nums1,nums2));
    }
 }
