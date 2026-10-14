class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        print(n,0,0,"",ans);
        return ans;
    }
    public static void print(int n, int open , int close , String str , List<String> ans){
        if(n == open && n == close){
            ans.add(str);
            return;
        }
        if(open > n || close>open){
            return;
        }
        print(n , open+1 , close , str+"(",ans);
        print(n , open , close+1 , str+")",ans);
    }
}