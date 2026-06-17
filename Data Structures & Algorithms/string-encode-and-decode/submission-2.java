class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty()) {
            return "#";
        }
        
        StringJoiner s = new StringJoiner("|");
        for (String str : strs) {
            s.add(Base64.getEncoder().encodeToString(str.getBytes()));
        }
        return s.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> ans = new ArrayList<>();
        
        if (str.equals("#")) {
            return ans;
        }
        
        // The -1 limit ensures [""] (which encodes to "") correctly splits into [""]
        String[] strs = str.split("\\|", -1); 
        
        for (String string : strs) {
            ans.add(new String(Base64.getDecoder().decode(string)));
        }
        return ans;
    }
}