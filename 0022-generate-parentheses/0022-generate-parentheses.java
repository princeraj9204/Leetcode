class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate(n , ans , 0 , 0,"");
        return ans;
    }
    public static void generate(int n , List<String> ans, int close , int open , String str){
        if(n == open && n == close){
            ans.add(str);
            return;
        }
        if(open > n || close > open){
            return;
        }
        generate(n , ans , close , open+1 , str+"(");
        generate(n , ans , close+1 , open , str+")");
    }
}

// class Solution {
//     public List<String> generateParenthesis(int n) {
//         List<String> ans = new ArrayList<>();
//         print(n,0,0,"",ans);
//         return ans;
//     }
//     public static void print(int n, int open , int close , String str , List<String> ans){
//         if(n == open && n == close){
//             ans.add(str);
//             return;
//         }
//         if(open > n || close>open){
//             return;
//         }
//         print(n , open+1 , close , str+"(",ans);
//         print(n , open , close+1 , str+")",ans);
//     }
// }