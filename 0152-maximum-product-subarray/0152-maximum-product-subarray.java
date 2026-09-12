class Solution {
    public int maxProduct(int[] nums) {
        int maxpr = nums[0];
        int minpr = nums[0];
        int ans = nums[0];
        
        for(int i=1;i<nums.length;i++){
            int curr = nums[i];

            int tempmax = Math.max(curr , Math.max(curr*maxpr , curr*minpr));
            int tempmin = Math.min(curr , Math.min(curr*maxpr , curr*minpr));

            maxpr = tempmax;
            minpr = tempmin;

            ans = Math.max(maxpr , ans);
        }
        return ans;
    }
}