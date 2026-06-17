class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s="";
        int i=0;
        int maxLength = Math.max(word1.length(),word2.length());
        while(i<maxLength){
            if(i<word1.length()) s+=word1.substring(i,i+1);
            if(i<word2.length()) s+=word2.substring(i,i+1);
            i++;
        }
        return s;
    }
}