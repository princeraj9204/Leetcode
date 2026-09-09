class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int fr1[] = new int[26];
        int fr2[] = new int[26];
        for(int i=0;i<s.length();i++){
            fr1[s.charAt(i)-'a']++;
            fr2[t.charAt(i)-'a']++;            
        }
        for(int i=0;i<fr1.length;i++){
            if(fr1[i] != fr2[i]){
                return false;
            }
        }
        return true;
    }
}