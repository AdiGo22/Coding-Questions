public class March8fourth {
    public static boolean BinarySearch (int[] nums , int target) {
        //method for Binary Search
        int start = 0 , end = nums.length-1;
        while(start<=end) {
           int mid = start+(end-start)/2;
           if(nums[mid] == target) {
             return true;
           } else if(nums[mid] < target) {
               start = mid+1;
           }else{
              end = mid-1;
           }
        }
        return false;
    }
    public static int GetLeastCommon (int[]nums1 , int[]nums2) {
        //using the binary search approach and adjusting the search since it is sorted both ways.
        
        for(int i:nums1) {
            //get inside nums1 apply binarysearch for nums2 
            if(BinarySearch(nums2,i) ) {   //if it holds true.
                 return i; //return i if it is true;
            }
        }
        return -1;
}
public static void main(String[] args) {
    int[]nums1 = new int[]{1,2,3,6};
    int[]nums2 = new int[]{2,3,4,5};
    System.out.println(GetLeastCommon(nums1,nums2));
}
}
