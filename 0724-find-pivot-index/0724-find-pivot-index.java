class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int left[] = new int[n];
        int right[] = new int[n];
        left[0] = nums[0];
        right[n-1] = nums[n-1];
        for(int i=1; i<n;i++){
            left[i] = left[i-1]+nums[i];
            }
        for(int j=n-2;j>=0;j--){
            right[j] = right[j+1]+nums[j];

        }
        for(int i=0;i<n;i++){
            if(left[i] == right[i]){
                return i;
            }
        }
        return -1;
    }
}