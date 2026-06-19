class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) return 0;
        int count=1;
        HashSet<Character> set = new HashSet<>();
        set.add(s.charAt(0));
        int i=0;
        for (int j=1; j<s.length();j++){
            while(i<s.length() && set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
            count = Math.max(count, j-i+1);
        }
        return count;
    }
}
