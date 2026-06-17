class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for (String str : strs) {
            encoded.append(str);
            encoded.append(Character.MAX_VALUE);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> ans = new ArrayList<>();
        int start = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==Character.MAX_VALUE){
                ans.add(str.substring(start,i));
                start = i+1;
            }
        }
        return ans;
    }
}