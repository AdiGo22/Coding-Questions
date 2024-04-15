public class MaxVowels {
    public static int maximum(String s, int k){
        char[] nums = s.toCharArray();
        int vowelcount=0;
        for(int i=0;i<k;i++){
        if(nums[i]=='a'||nums[i]=='e'|| nums[i]=='i'|| nums[i]=='o'||nums[i]=='u'){
            vowelcount++;
        }
        }
          int MaxVowels = vowelcount;
        for(int i=0;i<nums.length-k;i++){
            int j =i+k;
            //vowelcount =0;
             if(nums[j]=='a'||nums[j]=='e'|| nums[j]=='i'|| nums[j]=='o'||nums[j]=='u'){
            vowelcount++;
             }

             if(nums[i]=='a'||nums[i]=='e'|| nums[i]=='i'|| nums[i]=='o'||nums[i]=='u'){
            vowelcount--;
        }
            if(vowelcount>MaxVowels){
                MaxVowels = vowelcount;
            }
        }
        return MaxVowels;
    }

    public static void main(String args []){
     String s ="abciiidef";
     int k = 3;
     System.out.println(maximum(s, k));
    }
}
