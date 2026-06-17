class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i=0;
        int maxLength = Math.max(word1.length(),word2.length());
        while(i<maxLength){
            if(i<word1.length()) result.append(word1.charAt(i));
            if(i<word2.length()) result.append(word2.charAt(i));
            i++;
        }
        return result.toString();
    }
}