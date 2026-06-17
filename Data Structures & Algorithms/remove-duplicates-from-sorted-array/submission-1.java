class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int uniqueInd = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=nums[uniqueInd]) {
                uniqueInd++;
                nums[uniqueInd]=nums[i];
    
            }
        }
        
        return uniqueInd+1;
    }
}