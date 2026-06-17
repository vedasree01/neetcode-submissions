class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int counter = 0;
        int i=0;
        int newLength = nums.length;
        while(i<newLength) {
            if(set.add(nums[i])) {
                counter++;
                i++;
            }
            else {
                remove(nums,i,newLength);
                newLength--;
            }
        }
        return counter;
    }
    private void remove(int[] nums, int i, int newLength){
        for(int j=i;j<newLength-1;j++){
            nums[j] = nums[j+1];
        }
    }
}