class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        subset(nums,list,ans,0);
        return ans;
    }
    public static void subset(int arr[], List<Integer> list, List<List<Integer>> ans,int idx){
            ans.add(new ArrayList<>(list));
      for(int i=idx;i<arr.length;i++){
        if(i > idx && arr[i] == arr[i-1]){
            continue;
        }
        list.add(arr[i]);
        subset(arr,list,ans,i+1);
        list.remove(list.size()-1);
      }
    }
}