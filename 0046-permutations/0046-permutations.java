class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        possible(nums,curr,ans);
        return ans;
    }
    public static void possible(int arr[] ,List<Integer> curr, List<List<Integer>> ans){
        if(curr.size() == arr.length){
            ans.add(new ArrayList<>(curr)); 
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(curr.contains(arr[i])){
                continue;
            }
            curr.add(arr[i]);
            possible(arr,curr,ans);
            curr.remove(curr.size()-1);
        }
    }
}