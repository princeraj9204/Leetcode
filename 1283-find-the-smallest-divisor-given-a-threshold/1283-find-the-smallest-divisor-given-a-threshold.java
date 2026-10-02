class Solution {
    public static int possible(int arr[] , int div){
        int th = 0;
        for(int i=0;i<arr.length;i++){
            th += Math.ceil((double)arr[i] / div);
        }
        return th;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        int lo = 1;
        int hi = max , ans =0;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            int d = possible(nums , mid);
            if(d <= threshold){
                ans = mid;
                hi = mid-1;
            }else {
                lo = mid+1;
            }
        }
        return ans;
    }
}