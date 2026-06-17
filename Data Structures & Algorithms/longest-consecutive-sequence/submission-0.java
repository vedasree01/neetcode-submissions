class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(Integer num:set){
            if(!set.contains(num-1)) {
                ArrayList<Integer> currentList = new ArrayList<>();
                int currentNum = num;
                while(set.contains(currentNum)) {
                    currentList.add(currentNum);
                    currentNum++;
                }
                list.add(currentList);
            }
        }
        int maxSize=0;
        for(ArrayList<Integer> numList : list) {
            maxSize = Math.max(maxSize,numList.size());
        }
        return maxSize;
    }
}
