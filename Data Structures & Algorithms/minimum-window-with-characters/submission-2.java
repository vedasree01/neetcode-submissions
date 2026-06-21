class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()) return "";
        int left=0;
        int minLeft=0;
        int minLen=Integer.MAX_VALUE;
        int[] count = new int[128];
        for (int i=0; i<t.length(); i++) {
            count[t.charAt(i)]++;
        }
        int required=t.length();
        for(int right=0; right<s.length(); right++){
            char rightChar = s.charAt(right);
            if(count[rightChar]>0) required--;
            count[rightChar]--;
            while(required==0){
                if(minLen>(right-left+1)){
                    minLeft=left;
                    minLen = right-left+1;
                }
                char leftChar = s.charAt(left);
                count[leftChar]++;
                left++;
                if(count[leftChar]>0) required++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minLeft,minLeft+minLen);
    }
}
