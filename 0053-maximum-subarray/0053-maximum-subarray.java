class Solution {
    public int maxSubArray(int[] nums) {
       int ms = 0;
       int cs = 0;
       int a = Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++){
        if(a < nums[i]){
            a = nums[i];
        }
        cs = cs+nums[i];
        if(cs < 0){
            cs = 0;
        }
        ms = Math.max(cs,ms);
       }
       if(ms == 0){
        return a;
       }
       return ms;
    }
}