class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length-k+1];
        int left=0;
        int max=0;
        for(int right=0;right<nums.length;right++){
            max = Math.max(nums[right],max);
            if(right-left+1==k){
                result[left] = max;
                if(max==nums[left]){
                    max = Integer.MIN_VALUE;
                    for (int i=left+1; i<=right; i++) {
                        max = Math.max(max,nums[i]);
                    }
                }
                left++;
            }
        }
        return result;
    }
}
