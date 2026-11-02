class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        comb(candidates,target,list,ans,0);
        return ans;
    }
    public static void comb(int arr[] , int target , List<Integer> list,  List<List<Integer>> ans , int idx){
        if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(target < 0){
            return;
        }
        for(int i = idx;i<arr.length;i++){
            if(target >= arr[i]){
                list.add(arr[i]);
                comb(arr,target-arr[i],list,ans,i);
                list.remove(list.size()-1);
            }
        }
    }
}
