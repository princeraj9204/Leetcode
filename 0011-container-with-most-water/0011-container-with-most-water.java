class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int i=0;
        int j=height.length-1;
        while(i<=j){
            int len = Math.min(height[i],height[j]);
            int width = j-i;
            int area = len*width;
            if(area > max){
                max = area;
            }
            if(height[i] < height[j]){
                i++;
            }else {
                j--;
            }
        }
        return max;
    }
}