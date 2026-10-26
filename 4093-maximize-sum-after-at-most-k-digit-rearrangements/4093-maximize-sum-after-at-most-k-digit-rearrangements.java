
import java.util.Arrays;

class Solution {
    public long maximizeSum(int[] nums, int k) {
        int n = nums.length;
        long sum = 0;

        long[] gains = new long[n];

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            int maxValue = findMax(nums[i]);
            gains[i] = (long) maxValue - nums[i];
        }

        Arrays.sort(gains);

        for (int i = n - 1; i >= 0 && k > 0; i--) {
            if (gains[i] <= 0) {
                break;
            }

            sum += gains[i];
            k--;
        }

        return sum;
    }

    private int findMax(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        Arrays.sort(digits);

        StringBuilder sb = new StringBuilder();

        for (int i = digits.length - 1; i >= 0; i--) {
            sb.append(digits[i]);
        }

        return Integer.parseInt(sb.toString());
    }
}
