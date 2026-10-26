class Solution {
    public long maximizeSum(int[] nums, int k) {
        long sum = 0;
        int n = nums.length;
        long gain[] = new long[n];
        for(int i=0;i<nums.length;i++){
            sum += nums[i];

            int maxvalue = findmax(nums[i]);
            gain[i] = (long)maxvalue-nums[i];
        }
        Arrays.sort(gain);
        for(int i=gain.length-1;i>=0 && k>0 ;i--){
            if(gain[i] < 0){
                break;
            }
            sum += gain[i];
            k--;
        }
        return sum;
    }
    public static int findmax(int n){
        char[] arr = String.valueOf(n).toCharArray();
        Arrays.sort(arr);
        StringBuilder sb =new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]);
        }
        return Integer.parseInt(sb.toString());
    }
}