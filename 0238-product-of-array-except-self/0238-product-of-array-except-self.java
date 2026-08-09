class Solution {
    public static int[] prefixproduct(int prefix[] , int nums[]){
        int mul = 1;
        prefix[0] = 1;
        for(int i=1;i<nums.length;i++){
            mul *= nums[i-1];
            prefix[i] = mul;
        }
        return prefix;
    }
    public static int[] suffixproduct(int suffix[] , int nums[]){
        int mul = 1;
        suffix[nums.length-1] = 1;
        for(int i=nums.length-2;i>=0;i--){
            mul *= nums[i+1];
            suffix[i] = mul;
        }
        return suffix;
    }
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        int ans[] = new int[n];
        prefixproduct(prefix,nums);
        suffixproduct(suffix,nums);
        for(int i=0;i<n;i++){
            ans[i] = prefix[i]*suffix[i];
        }
        return ans;
    }
}