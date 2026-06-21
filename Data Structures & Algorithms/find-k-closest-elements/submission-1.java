class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left=0;
        int right=arr.length-1;
        int leftDiff;
        int rightDiff;
        ArrayList<Integer> list = new ArrayList<>();
        
        while(right-left+1 >k){
            leftDiff = Math.abs(arr[left]-x);
            rightDiff = Math.abs(arr[right]-x);
            if(leftDiff>rightDiff){
                left++;
            }else right--;
        }
        for(int i=left;i<=right;i++){
            list.add(arr[i]);
        }
        return list;
    }
}