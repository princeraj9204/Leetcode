class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int count =0;
            while(i<n && nums[i] == 1){
                count++;
                i++;
            }
            if(count > max){
                max = count;
            }
        }
        return max;
    }
}