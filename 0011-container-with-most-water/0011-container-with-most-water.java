class Solution {
    public int maxArea(int[] height) {
       int i = 0;
       int j = height.length-1;
       int maxarea = 0;
       while(i <= j){
        int len = Math.min(height[i] , height[j]);
        int width = j-i;
        int area = len*width;
        maxarea = Math.max(area , maxarea);
        if(height[i] < height[j]){
            i++;
        }else {
            j--;
        }
       }
       return maxarea;
    }
}