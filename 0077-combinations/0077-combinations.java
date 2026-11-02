class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int arr[] = new int[n];
        for(int i=1;i<=n;i++){
            arr[i-1] = i;
        }
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        comb(arr,k,ans,list,0,0);
        return ans;
    }
    public static void comb(int arr[],int k,  List<List<Integer>> ans, List<Integer> list, int idx, int st){
        if(st == k){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(idx > arr.length){
            return;
        }
        if(list.size() > k){
            return;
        }
        for(int i=idx;i<arr.length;i++){
            list.add(arr[i]);
            comb(arr,k,ans,list,i+1,st+1);
            list.remove(list.size()-1);
        }
    }
}