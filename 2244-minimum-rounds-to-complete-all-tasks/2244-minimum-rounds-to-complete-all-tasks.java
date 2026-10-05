class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i=0;i<tasks.length;i++){
            map.put(tasks[i] , map.getOrDefault(tasks[i] , 0)+1);
        }
        int ans=0;
        for(int nums:map.values()){
            if(nums < 2){
                return -1;
            }
            while(nums >= 3){
                nums -= 3;
                ans++;
            }
            while(nums >= 2){
                nums-=2;
                ans++;
            }
            if(nums == 1){
                ans += 1;
            }
        }
        return ans;
    }
}