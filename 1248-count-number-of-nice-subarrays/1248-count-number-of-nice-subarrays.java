class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return Atmost(nums,k)-Atmost(nums,k-1);
    }
    public static int Atmost(int nums[] ,int k){
        int left = 0;
        int ans = 0;
        for(int right=0;right<nums.length;right++){
            if(nums[right] % 2 != 0){
                k--;
            }
            while(k < 0){
                if(nums[left]%2 != 0){
                    k++;
                }
                left++;
            }
            ans += right-left+1;
        }
        return ans;
    }
}