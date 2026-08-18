class Solution {
    public boolean rotateString(String s, String goal) {
         int len = s.length();
        int len1 = len;
        int i=0;
        while(i<len1){
            char c = s.charAt(0);
            s = s.substring(1);
            s = s+c;
            if(s.equals(goal)){
                return true;
            }
            i++;
        }
        return false;
    }
}