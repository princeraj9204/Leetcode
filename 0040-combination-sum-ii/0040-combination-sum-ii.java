class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) { 
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        sum(candidates,target,ans,list,0);
        return ans;
    }
    public static void sum(int arr[] , int key , List<List<Integer>> ans,List<Integer> list,int idx){
        if(key == 0){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(idx >= arr.length){
            return;
        }
        for(int i=idx;i<arr.length;i++){
            if(i > idx && arr[i] == arr[i-1]){
                continue;
            }
            if(arr[i] > key){
                break;
            }
              if(key >= arr[i]){
                list.add(arr[i]);
                sum(arr,key-arr[i],ans,list,i+1);
                list.remove(list.size()-1);
              }
        }
    }
}