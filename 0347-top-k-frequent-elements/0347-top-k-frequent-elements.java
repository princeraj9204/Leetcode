class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int ans[] = new int[k];
       HashMap<Integer , Integer> map = new HashMap<>();
       for(int i=0;i<nums.length;i++){
        map.put(nums[i] , map.getOrDefault(nums[i] , 0)+1);
       }
        List<Map.Entry<Integer , Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b) -> b.getValue() - a.getValue());
        int i =0;
        for(Map.Entry<Integer , Integer> entry:list){
            ans[i++] = entry.getKey();
            k--;
            if(k == 0){
                return ans;
            }
        }
        return ans;
    }
}