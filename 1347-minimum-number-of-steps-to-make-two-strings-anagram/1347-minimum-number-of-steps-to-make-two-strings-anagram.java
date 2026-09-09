class Solution {
    public int minSteps(String s, String t) {
        int fr1[] = new int[26];
        int fr2[] = new int[26];
        for(int i=0;i<s.length();i++){
            fr1[s.charAt(i)-'a']++;
            fr2[t.charAt(i)-'a']++;
        }
        int step = 0;
        for(int i=0;i<26;i++){
            if(fr1[i] > fr2[i]){
                int a = fr1[i] - fr2[i];
                step = step + a;
            }
        }
        return step;
    }
}