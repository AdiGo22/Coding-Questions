public class LongestOnesDeletingZero2{
    public static int longest(int[]nums , int k ){
        int CountOne=0; int count =0;int  skip=0;  int maxCount =0;
        for(int i=0;i<nums.length;i++){
              if(nums[i]==1){
                CountOne++;

        }else{
            skip++;

            if(skip==k ){
            count = CountOne;
            continue;
        }
            maxCount = count;
        if(count> maxCount){
            maxCount = count;
        }
           
        
    }
}
    return maxCount;
}



public static void main(String args[]){ 
    int[] nums = new int []{1,1,1,0,0,0,1,1,1,1,0};
    int k = 2;
    System.out.println(longest(nums,k));
    
}

}