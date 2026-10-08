class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int lo = 1;
        int ans= -1;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            if(max < bloomDay[i]){
                max = bloomDay[i];
            }
        }
        int hi = max;
        while(lo <= hi){
            int mid = (hi+lo)/2;
            if(ispossible(bloomDay , mid , m, k)){
                ans=mid;
                hi = mid-1;
            }else {
                lo = mid+1;
            }
        }
        return ans;
    }
    public static boolean ispossible(int arr[] , int day , int m , int k){
        int count = 0;
        int boucket = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] <= day){
                count++;
            }else {
                count = 0;
            }
            if(count == k){
                boucket++;
                count = 0;
            }
        }

        return boucket>=m;
    }
}