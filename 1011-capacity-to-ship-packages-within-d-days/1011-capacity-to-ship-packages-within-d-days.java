class Solution {
    public static int possible(int weight[] , int limit){
       int day = 1;
       int load = 0;
       for(int i=0;i<weight.length;i++){
        if(load+weight[i] > limit){
            day++;
            load = weight[i];
        }else {
            load += weight[i];
        }
       }
       return day;
    }
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0 , max = Integer.MIN_VALUE;
        for(int i=0;i<weights.length;i++){
            sum += weights[i];
            if(weights[i] > max){
                max = weights[i];
            }
        }
        int lo = max;
        int hi = sum;
        int ans = 0;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            int d = possible(weights , mid);
            if(d <= days){
                ans = mid;
                hi = mid-1;
            }else {
                lo = mid+1;
            }
        }
        return ans;
    }
}