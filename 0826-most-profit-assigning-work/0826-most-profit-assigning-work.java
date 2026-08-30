class Solution {
    public static int search(int target , int difficulty[] , int profit[]){
       int max = 0;
       for(int i=0;i<difficulty.length;i++){
        if(difficulty[i] <= target){
            max = Math.max(max,profit[i]);
        }
       }
       return max;
    }
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int sum = 0;
        for(int i=0;i<worker.length;i++){
        sum += search(worker[i] , difficulty , profit);
       }
       return sum;
    }
}