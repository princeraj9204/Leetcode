class Solution {
    public int kConcatenationMaxSum(int[] arr, int k) {
         long mod = 1_000_000_007L;
         long totalsum = 0;
         for(int i=0;i<arr.length;i++){
            totalsum += arr[i];
         }
         long currsum = 0;
         long maxone = 0;
         long maxtwo = 0;
         for(int i=0;i<2*arr.length;i++){
            int num = arr[i%arr.length];
            
            currsum = Math.max(0,currsum+num);
            maxtwo = Math.max(maxtwo , currsum);
            if(i < arr.length){
                maxone = Math.max(maxone , currsum);
            }
         }
         long ans=0l;
         if(k == 1){
            ans += maxone;
         }else {
            ans += maxtwo;

            if(totalsum > 0){
                ans += (long)(k-2)*totalsum;
            }
         }
         return (int)(ans%mod);
    }
}