class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int currgas = 0;
        int totalgas = 0;
        int ans = 0;
        for(int i=0;i<gas.length;i++){
            totalgas = totalgas + gas[i] - cost[i];
            currgas = currgas + gas[i] - cost[i];
            if(currgas < 0){
                ans = i+1;
                currgas = 0;
            } 
        }
        if(totalgas < 0){
            return -1;
        }
        return ans;
    }
}