class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()) return "";
        int left=0;
        int minLeft=0;
        int minRight=0;
        int minLen=Integer.MAX_VALUE;
        int[] count = new int[128];
        for(int i=0;i<t.length();i++){
            count[t.charAt(i)]++;
        }
        for(int right=0; right<s.length(); right++){
            count[s.charAt(right)]--;
            while(matched(count)){
                if(minLen>(right-left+1)){
                    minRight=right;
                    minLeft=left;
                    minLen = right-left+1;
                }
                count[s.charAt(left)]++;
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minLeft,minLeft+minLen);
    }
    private boolean matched(int[] nums){
        for(int i:nums){
            if(i>0) return false;
        }
        return true;
    }
}
