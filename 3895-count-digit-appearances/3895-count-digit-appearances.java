class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            int a = nums[i];
            while(a!=0){
                int b = a%10;
                if(b == digit){
                    count++;
                }
                a /= 10;
            }
        }
        return count;
    }
}