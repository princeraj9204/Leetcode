class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length;
        int left[] = new int[n];
        int right[] = new int[n];
         left[0] = arr[0];
        for(int i=1;i<arr.length;i++){
           left[i] = Math.max(arr[i] , left[i-1]+arr[i]); 
        }
        right[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            right[i] = Math.max(arr[i] , arr[i]+right[i+1]);
        }
        int ans = left[0];
        for(int i=0;i<n;i++){
            if(ans < left[i]){
                ans = Math.max(ans,left[i]);
            }
        }
        for(int i=1;i<n-1;i++){
            int sum = left[i-1]+right[i+1];
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}