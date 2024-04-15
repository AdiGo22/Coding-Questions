import java.util.*;
class Leetcode46Permutations{
private void recurPermu(int indx , int[] nums, List<List<Integer>>ans){
    if(indx == nums.length){
        List<Integer>ds = new ArrayList<>();
     for(int i=0;i<nums.length;i++){
        ds.add(nums[i]);
     }
     ans.add(new ArrayList<>(ds));
     return;
    }

    for(int i=indx;i<nums.length;i++){
        swap(i,indx,nums);
        recurPermu(indx+1, nums, ans);
        swap(i,indx,nums);
    }
}

private void swap(int i,int j,int[]nums){
int t = nums[i];
nums[i]=nums[j];
nums[j]=t;
}//swap function finish

public List<List<Integer>> permute(int[]nums){
    List<List<Integer>>ans = new ArrayList<>();
    recurPermu(0, nums, ans);
    return ans;
}

}