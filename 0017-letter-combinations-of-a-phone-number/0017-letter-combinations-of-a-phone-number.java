class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character , String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        List<String> ans = new ArrayList<>();
        print(digits,map,ans,"",0);
        return ans;
    }
    public static void print(String digits ,HashMap<Character , String> map , List<String> ans , String str, int idx){
        if(idx == digits.length()){
            ans.add(str);
            return;
        }
        char ch = digits.charAt(idx);
        String letter = map.get(ch);

        for(int i=0;i<letter.length();i++){
            char chh = letter.charAt(i);
            print(digits,map,ans , str+chh , idx+1);
        }
    }
}