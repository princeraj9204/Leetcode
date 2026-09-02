class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int fre1[] = new int[26];
        int fre2[] = new int[26];
        for(int i=0;i<ransomNote.length();i++){
            fre1[ransomNote.charAt(i)-'a']++;
        }
        for(int i=0;i<magazine.length();i++){
            fre2[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(fre1[i] > fre2[i]){
                return false;
            }
        }
        return true;
    }
}