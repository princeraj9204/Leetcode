class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        comb(arr,k,n,ans,list,0);
        return ans;
    }
    public static void comb(int arr[],int k,int n,List<List<Integer>> ans, List<Integer> list,int idx){
        if(list.size() == k && n==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(n < 0 || list.size() > k){
            return;
        }
        for(int i=idx;i<arr.length;i++){
            if(n >= arr[i]){
                list.add(arr[i]);
                comb(arr,k,n-arr[i],ans,list,i+1);
                list.remove(list.size()-1);
            }
        }
    }
}