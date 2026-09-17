class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()){
            return -1;
        }
       int k = needle.length();
       String ans = "";
      ans = haystack.substring(0,k);
      if(needle .equals(ans)){
        return 0;
      }
      int g = 1;
      for(int i=k;i<haystack.length();i++){
        ans=ans.substring(1);
        ans = ans+haystack.charAt(i);
        if(needle .equals(ans)){
            return g;
         }
         g++;
      }
      return -1;
    }
}