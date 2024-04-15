class Solution {
    public int maxArea(int[] height) {
   int maxarea =0;
   int left_pointer =0;
   int right_pointer=height.length-1;

   while(left_pointer<right_pointer){
    if(height[left_pointer]<height[right_pointer]){
        maxarea = Math.max(maxarea,height[left_pointer]*(right_pointer-left_pointer));
        left_pointer++;
    }else{
        maxarea = Math.max(maxarea,height[right_pointer]*(right_pointer-left_pointer));
        right_pointer--;
    }
   }

   return maxarea;
}
}