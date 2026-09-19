class Solution {
    public int longestPalindrome(String s) {

      HashMap<Character,Integer> map = new HashMap<>();

      for(int i=0;i<s.length();i++){
        map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) , 0)+1);
      }

      int ans = 0;
      boolean odd = false;

      for(int fre:map.values()){

        if(fre%2==0){
            ans += fre;
        }else {
            ans += (fre-1);
            odd = true;
        }
      }

      if(odd == true){
        ans++;
      }

      return ans;
       
    }
}