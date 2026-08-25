class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int fre = 1;
        int ans = nums[0];
        for(int i=1;i<n;i++){
            if(ans == nums[i]){
                fre++;
            }else {
                fre--;
            }
            if(fre == 0){
                ans = nums[i];
                fre = 1;
            }
        }
        return ans;
    }
}