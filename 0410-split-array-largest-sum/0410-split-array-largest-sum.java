class Solution {
    public int splitArray(int[] nums, int k) {
        int max = 0;
        int sum =0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(max < nums[i]){
                max= nums[i];
            }
        }
        int lo = max;
        int hi = sum;
        while(lo <= hi){
            int mid = lo+(hi-lo)/2;
            if(ispossible(nums , k , mid)){
                hi= mid-1;
            }else {
                lo = mid+1;
            }
        }
        return lo;
    }
    public static boolean ispossible(int arr[] , int k , int maxsum){
        int part = 1;
        int currsum = 0;
        for(int nums:arr){
            if(currsum+nums <= maxsum){
                currsum += nums;
            }else {
                part++;
                currsum = nums;
            }
        }
        return part <= k;
    }
}