class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int lastgreater = -1;
        int lastvalid = -1;

        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > right){
                lastgreater = i;
            }

            if(nums[i] >= left && nums[i] <= right){
                lastvalid = i;
            }
             count += Math.max(0, lastvalid - lastgreater);
        }
        return count;
    }
}