class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<len;i++){
            int count =0;
           while(i<len && nums[i]==1){
            count++;
            i++;
           } 
           if(count>max){
            max = count;
           }
        }
        return max;
    }
}