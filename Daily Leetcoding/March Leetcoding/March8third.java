public class March8third {
    public static int getLeastCommon (int[]nums1 , int[]nums2) {
        //two pointers approach
        int start1 = 0;
        int start2 = 0;
        //start pointers for both nums1 and nums2

        int end1 = nums1.length;
        int end2 = nums2.length;

        while(start1 < end1 && start2 < end2)  {
            if(nums1[start1]== nums2[start2]){
                return nums1[start1];
            }else if(nums1[start1] < nums2[start2]) {
                //since both sorted thus move the pointer of nums1 to adjust with nums2
                start1++;
            }else{
                start2++; //else otherwise
            }
        }//return the first found element since sorted.
        return -1; //else otherwise.
    }
    public static void main(String[] args) {
        int[]nums1 = new int[]{1,2,3};
        int[]nums2 = new int[]{2,4};
        System.out.println(getLeastCommon(nums1, nums2));
    }
}
