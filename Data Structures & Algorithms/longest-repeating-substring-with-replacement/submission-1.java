class Solution {
    public int characterReplacement(String s, int k) {
        if(s.isEmpty()) return 0;
        int count=0;
        int i=0;
        int maxFreq=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int j=0;j<s.length();j++){
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j),0)+1);
            maxFreq = Math.max(maxFreq, map.getOrDefault(s.charAt(j),0));
            while((j-i+1)-maxFreq>k){
                map.put(s.charAt(i), map.get(s.charAt(i))-1);
                i++;
            }
            count = Math.max(count,j-i+1);
        }
        return count;
    }
}
