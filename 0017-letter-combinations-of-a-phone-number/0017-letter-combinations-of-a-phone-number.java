class Solution {
    static String[] key= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        comb(digits,ans,"");
        return ans;
    }
    public static void comb(String digits,List<String> ans,String str){
        if(digits.length() == 0){
            ans.add(str);
            return;
        }
        char ch = digits.charAt(0);
        String s = key[ch-'0'];
        for(int i=0;i<s.length();i++){
            comb(digits.substring(1),ans,str+s.charAt(i));
        }
    }
}