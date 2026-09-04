class Solution {
    public int maxSubarraySumCircular(int[] nums) {
       int maxsum = Integer.MIN_VALUE;
       int minsum = Integer.MAX_VALUE;
       int totalsum = 0;
       int ans = -1;
       int cs = 0;
       int cmin = 0;
       for(int i=0;i<nums.length;i++){
        totalsum += nums[i];
        cs = Math.max(nums[i] , cs+nums[i]);
        maxsum  = Math.max(cs , maxsum);
        cmin = Math.min(nums[i] , cmin+nums[i]);
        minsum = Math.min(cmin,minsum);
       }
        boolean b = true;
        for(int i=0;i<nums.length;i++){
           if(nums[i] < 0){
            continue;
           }
           b  = false;
        }
        if(b == true){
            return maxsum;
        }
        return Math.max(maxsum , totalsum-minsum);
    }
}