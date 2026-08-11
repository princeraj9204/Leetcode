class Solution {
    public int missingNumber(int[] nums) {
        int len =  nums.length;
        Arrays.sort(nums);
        if(nums[len-1]<len){
            return len;
        }
        int i=0;
        int m = 0;
        int j=0;
        while(j<len){
            if(nums[j]!=i){
                m = i;
                break;
            }
            i++;
            j++;
        }
        return m;
    }
}