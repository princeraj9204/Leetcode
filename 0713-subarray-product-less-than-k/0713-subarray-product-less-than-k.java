class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int si=0,ei=0,p=1,ans=0;
        int n = nums.length;
        while(ei < n){

            // Window Grow
            p = p*nums[ei];

            // Window Shrink
            while(p >= k && si<=ei){
                p = p/nums[si];
                si++;
            }
            //Ans Update
            ans = ans + (ei-si+1);
            ei++;

        }
        return ans;
    }
}