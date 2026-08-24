class Solution {
    public int[] getAverages(int[] nums, int k) {
       int n = nums.length;
       int ans[] = new int[n];
       for(int i=0;i<n;i++){
        ans[i] = -1;
       }
       long sum = 0;
       int window = 2*k+1;
       int a = k;
       if(window>n){
        return ans;
       }
       for(int i=0;i<window;i++){
        sum += nums[i];
       }
       ans[a] = (int)(sum/window);
       for(int i=window;i<n;i++){
        sum = sum-nums[i-window]+nums[i];
        a++;
        ans[a] = (int)(sum/window);
       }
       return ans;
    }
}