class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> ans = new ArrayList<>();
       List<Integer> list = new ArrayList<>();
       subset(nums,ans,list,0);
       return ans; 
    }
    public static void subset(int[] arr,List<List<Integer>> ans,List<Integer> list,int idx){
          
        if (idx == arr.length) {
            ans.add(new ArrayList<>(list));
            return;
        }

        
        list.add(arr[idx]);
        subset(arr, ans, list, idx + 1);

        
        list.remove(list.size() - 1);

        
        subset(arr, ans, list, idx + 1);
    }
}