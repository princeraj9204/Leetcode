class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int i = -1;
        int n = nums.length;
        int ans[] = new int[nums.length];
        for(int j=0;j<n;j++){
            if(nums[j] < pivot){
                i++;
                ans[i] = nums[j];
            }
        }
        for(int j=0;j<n;j++){
            if(nums[j] == pivot){
                i++;
                ans[i] = pivot;
            }
        }
         for(int j=0;j<n;j++){
            if(nums[j] > pivot){
                i++;
                ans[i] = nums[j];
            }
        }
       return ans;
    }
}