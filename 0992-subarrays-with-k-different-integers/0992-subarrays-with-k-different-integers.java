class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return Atmost(nums,k)-Atmost(nums,k-1);
    }
    public static int Atmost(int nums[] , int k){
        int fre[] = new int[nums.length+1];

        int left=0;
        int ans=0;
        int distinct =0;
        for(int right=0;right<nums.length;right++){
            if(fre[nums[right]] == 0){
                distinct++;
            }
            fre[nums[right]]++;

            while(distinct > k){
                fre[nums[left]]--;
                if(fre[nums[left]] == 0){
                    distinct--;
                }
                left++;
            }
            ans += right-left+1;
        }
        return ans;
    }
}