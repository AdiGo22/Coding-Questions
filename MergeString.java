class MergeString {
    public String mergeAlternately(String word1, String word2) {
       int len1 = word1.length();
       int len2 = word2.length();
       int TotalLen = len1+len2;
       char [] res = new char[TotalLen];
       int i=0,j=0,k=0;
    //i - for traversing througth the whole res array
    //j - for checking inside word1
    //k - for checking inside word2
    while(i<TotalLen){
        if(j<len1){
         res[i++] = word1.charAt(j++);
        }
        if(k<len2){
         res[i++] = word2.charAt(k++);
        }
    }

return new String(res);
}
}
