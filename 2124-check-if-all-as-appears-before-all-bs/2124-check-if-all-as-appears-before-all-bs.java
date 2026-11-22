class Solution {
    public boolean checkString(String s) {
        boolean b = true;
        for(int i=0;i<s.length();i++){
            if(b == false && s.charAt(i) == 'a'){
                return false;
            }else if(s.charAt(i) == 'b'){
                b = false;
            }
        }
        return true;
    }
}