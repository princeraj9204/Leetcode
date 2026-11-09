class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans = new ArrayList<>();
        order(n,0,ans);
        return ans;
    }
    public static void order(int n , int curr , List<Integer> ans){
        if(curr > n){
            return;
        }
        if(curr != 0){
            ans.add(curr);
        }
        int i = 0;
        if(curr == 0){
            i = 1;
        }
        for(;i<=9;i++){
            order(n,curr*10+i,ans);
        }
    }
}