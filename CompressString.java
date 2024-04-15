class Solution {
    public int compress(char[] chars) {

    int count=1;
      String charString = String.valueOf(chars[0]);
   for(int i=1;i<chars.length;i++){
    char curr = chars[i];
    char prev = chars[i-1];         

    if(curr == prev){
        count++;
    }else{
        if(count>1){
            charString+=count;
            count=1;//set count to 1
        }
        charString+=curr;
    }
   }
   
   if(count>1){
    charString+=count;
    count=1;//set
   }
//spill charString into chars

for(int i=0;i<charString.length();i++){
    chars[i] = charString.charAt(i); //filled
}

return chars.length;
    }
}           
    