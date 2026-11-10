class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
       int n = nums.length;
       int mid = nums[n/2];
       long ans = 0;
       for(int i=0;i<n;i++){
        ans += Math.abs((long)(nums[i]-mid));
       }
       return (int)ans;
    }
}