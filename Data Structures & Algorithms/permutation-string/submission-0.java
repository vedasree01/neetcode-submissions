class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int[] count = new int[26];
        for (int i=0; i<s1.length(); i++) {
            count[s1.charAt(i)-'a']++;
        }
        int left=0;
        for(int right=0; right<s2.length();right++){
            count[s2.charAt(right)-'a']--;
            if(right-left+1>s1.length()) {
                count[s2.charAt(left)-'a']++;
                left++;
            }
            if(matched(count)) return true;
        }
        return false;
    }
    private boolean matched(int[] arr){
        for(int i:arr){
            if(i!=0) return false;
        }
        return true;
    }
}
