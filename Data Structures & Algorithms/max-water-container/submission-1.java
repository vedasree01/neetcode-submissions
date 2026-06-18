class Solution {
    public int maxArea(int[] heights) {
        int i=0, j=heights.length-1;
        int maxWater = 0;
        int area=0;
        while(i<j){
            area = Math.min(heights[i],heights[j]) *(j-i);
            maxWater = Math.max(area, maxWater);
            if (heights[i]<heights[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxWater;
    }
}
