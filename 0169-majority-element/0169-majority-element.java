class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums[0];
        int count = 1;
        int n = nums.length;
        for(int i=1;i<n;i++){
            if(nums[i] == majority){
                count++;
            }else {
                count--;
            }
            if(count == 0){
                majority = nums[i];
                count = 1;
            }
        }
        return majority;
    }
}