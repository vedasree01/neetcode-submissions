class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int minPos = 1;
        for(int num:nums) {
            set.add(num);
        }
        while(set.contains(minPos)) {
            minPos++;
        }
        return minPos;
    }
}