class Solution {
    public int lengthOfLongestSubstring(String s) {
       int freq[] = new int[256];
       int si=0,ei=0,maxlength=0;
       while(ei < s.length()){
        //window grow
        char c = s.charAt(ei);
        freq[c]++;

        //window shrink
        while(freq[c] > 1){
            char ch = s.charAt(si);
            freq[ch]--;
            si++;
        }
        maxlength = Math.max(maxlength , ei-si+1);
        ei++;
       }
       return maxlength;
    }
}