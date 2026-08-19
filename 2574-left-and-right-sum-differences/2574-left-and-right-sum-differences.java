class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] pf = new int[n];
        int[] sf = new int[n];
        pf[0] = 0;
        sf[n-1] = 0;
        for(int i=1;i<=n-1;i++){
            pf[i] = pf[i-1]+nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            sf[i] = sf[i+1]+nums[i+1];
        }
       //int res[] = new int[n];
        for(int i=0;i<n;i++){

            nums[i] = Math.abs(sf[i]-pf[i]);
        }
        return nums;
    }
}