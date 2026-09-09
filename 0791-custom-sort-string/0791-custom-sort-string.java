class Solution {
    public static boolean search(StringBuilder s , char curr){
        for(int i=0;i<s.length();i++){
           if(s.charAt(i) == curr){
            s.deleteCharAt(i);
            return true;
           }
        }
        return false;
    }
    public String customSortString(String order, String s) {

        StringBuilder str = new StringBuilder(s);
        StringBuilder ans = new StringBuilder();

        for(int i=0;i<order.length();i++){
            char curr = order.charAt(i);
            while(search(str,curr)){
                ans.append(curr);
            }
        }
        ans.append(str);
        return ans.toString();
    }
}