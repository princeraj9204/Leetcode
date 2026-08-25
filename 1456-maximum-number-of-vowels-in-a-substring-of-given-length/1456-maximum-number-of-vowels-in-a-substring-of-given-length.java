class Solution {
    public static boolean vowel(char ch){
        if(ch == 'a' || ch == 'u' || ch == 'o' || ch == 'i' || ch == 'e'){
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {
        int count = 0;
        for(int i=0;i<k;i++){
            if(vowel(s.charAt(i))){
                count++;
            }
        }
        int max = count;
        for(int i=k;i<s.length();i++){
            if(vowel(s.charAt(i))){
                count++;
            }
            if(vowel(s.charAt(i-k))){
                count--;
            }
            max = Math.max(count,max);
        }
        return max;
    }
}