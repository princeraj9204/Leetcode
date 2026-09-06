class Solution {
   public static long totaltime(int arr[], int speed) {
    long thr = 0;

    for (int i = 0; i < arr.length; i++) {
        thr += (arr[i] + (long)speed - 1) / speed;
    }

    return thr;
}
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            if(piles[i] > max){
                max = piles[i];
            }
        }
        int lo = 1;
        int hi = max;
        int ans = 0;
        while(lo <= hi){
            int mid = (hi+lo)/2;
            long hr = totaltime(piles , mid);
            if(hr <= h){
                ans = mid;
                hi = mid-1;
            }else {
                lo = mid+1;
            }
        }
        return ans;
    }
}