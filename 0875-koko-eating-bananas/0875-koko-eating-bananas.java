class Solution {
    public static int total(int arr[] , int speed){
        int ans =0 ;
        for(int i=0;i<arr.length;i++){
            ans += Math.ceil((double)arr[i] / speed);
        }
        return ans;
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
      int a = 0;
      while(lo <= hi){
        int mid = (hi+lo)/2;
        int totaltime = total(piles,mid);
        if(totaltime <= h){
            a = mid;
            hi = mid-1;
        }else {
            lo = mid+1;
        }
      }
      return a;
    }
}