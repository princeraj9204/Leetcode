class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int si=0,ei=0,min = Integer.MAX_VALUE,sum=0;
       while(ei < nums.length){
        // window grow

        sum += nums[ei];

        //window shrink
       
        while( sum >= target){
            sum -= nums[si];

            min= Math.min(min , ei-si+1);
            si++;
        }
        ei++;

       }
       if(min == Integer.MAX_VALUE){
        return 0;
       }
       return min;
    }
}