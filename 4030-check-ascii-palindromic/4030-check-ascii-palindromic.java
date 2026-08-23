class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder t = new StringBuilder();
        for(int i=0;i<s.length();i++){
            int ascii = s.charAt(i);
            String binary = Integer.toBinaryString(ascii);
            t.append('0');
            t.append(binary);
        }
        int i=0;
        int j = t.length()-1;
        while(i<j){
            if(t.charAt(i) != t.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}