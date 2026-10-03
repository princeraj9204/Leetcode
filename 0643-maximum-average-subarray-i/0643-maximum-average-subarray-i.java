class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum =0;
        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        double avg = sum/k;
        double max = avg;
        for(int i=k;i<nums.length;i++){
            double a = nums[i-k];
            a /= k;
            avg -= a;
            double b = nums[i];
            b /= k;
            avg += b;
            max = Math.max(avg , max);
        }
        return max;
    }
}