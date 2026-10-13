class Solution {
    public long maxAlternatingSum(int[] nums) {
        long res=0;
        for(int i=0;i<nums.length;i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        int i =0;
        int j = nums.length-1;
        while(i <= j){
            if(i == j){
                res  += nums[i];
            }else {
                res += nums[j]-nums[i];
            }
            i++;
            j--;
        }
        return res;
    }
}