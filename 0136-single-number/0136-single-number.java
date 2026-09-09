class Solution {
    public int singleNumber(int[] nums) {
        // if(nums.length == 1){
        //     return nums[0];
        // }
        // Arrays.sort(nums);
        // for(int i=1;i<nums.length;i++){
        //     if(i==1 && nums[i]!=nums[i-1]){
        //         return nums[i-1];
        //     }
        //     if( i< nums.length-1 && nums[i]!=nums[i-1] && nums[i+1] != nums[i]){
        //         return nums[i];
        //     }
        //     if(i == nums.length-1 && nums[i]!=nums[i-1]){
        //         return nums[i];
        //     }
        // }
        // return 1;
        int xor = 0;
        for(int i=0;i<nums.length;i++){
            xor = xor^nums[i];
        }
        return xor;
    }
}