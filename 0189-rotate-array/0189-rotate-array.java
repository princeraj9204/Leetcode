class Solution {
    public void reverse(int nums[],int si,int ei){
        while(si<ei){
            int temp = nums[si];
            nums[si] = nums[ei];
            nums[ei] = temp;
            si++;
            ei--;
        }
    }
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k%len;
       reverse(nums,len-k,len-1);
       reverse(nums,0,len-k-1);
       reverse(nums,0,len-1);
    }
}