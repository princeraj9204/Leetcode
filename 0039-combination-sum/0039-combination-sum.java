class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        comb(candidates,target,ans,list,0);
        return ans;
    }
    public static void comb(int[] candidate ,int target ,List<List<Integer>> ans , List<Integer> list,int idx){
        if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(target < 0 ){
            return;
        }
        for(int i=idx;i<candidate.length;i++){
            if(target >= candidate[i]){
                list.add(candidate[i]);
                comb(candidate , target-candidate[i] , ans , list,i);
                list.remove(list.size()-1);
            }
        }
    }
}