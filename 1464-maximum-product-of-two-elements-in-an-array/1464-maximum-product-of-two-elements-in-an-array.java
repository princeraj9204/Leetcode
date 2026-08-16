class Solution {
    public int maxProduct(int[] nums) {
       int i = 0;
       int j = nums.length-1;
       int max = Integer.MIN_VALUE;
       while(i<j){
        int mul = 1;
         mul = mul*(nums[i]-1)*(nums[j]-1);
        if(nums[i]<nums[j]){
            i++;
        }else {
            j--;
        }
        max = Math.max(max,mul);
       }
       return max;
    }
}