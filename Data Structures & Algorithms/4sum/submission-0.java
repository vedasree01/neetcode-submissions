class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> finalResult = new ArrayList<>();
        if (nums==null || nums.length<4) return finalResult;
        Arrays.sort(nums);
        List<List<Integer>> resultList = new ArrayList<>();
        for(int i=0; i<nums.length-3; i++){
            if (i>0 && nums[i]==nums[i-1]) {
                continue;
            }
            resultList = threeSum(nums, i+1, (long)target-nums[i]);
            for(List<Integer> list:resultList) {
                List<Integer> tempList = new ArrayList<>();
                tempList.add(nums[i]);
                tempList.addAll(list);
                finalResult.add(tempList);
            }
        }
        return finalResult;
    }

    public List<List<Integer>> threeSum(int[] nums, int start, long target) {
        int j,k;
        List<List<Integer>> result = new ArrayList<>();
        for(int i=start;i<nums.length-2;i++){
            if (i>start && nums[i]==nums[i-1]) {
                continue;
            }
            j=i+1; k=nums.length-1;
            while(j<k){
                long sum = (long) nums[i]+nums[j]+nums[k];
                if(sum==target) {
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while (j<k && nums[j] == nums[j-1]) {
                        j++;
                    }
                    while (j<k && nums[k] == nums[k+1]) {
                        k--;
                    }
                }
                else if(sum<target) j++;
                else k--;
            }
        }
        return result;
    }
}