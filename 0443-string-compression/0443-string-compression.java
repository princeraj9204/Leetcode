class Solution {
    public int compress(char[] chars) {
        if(chars.length == 1){
            return 1;
        }
        String s = new String(chars);
        String result = "";
        for(int i=0;i<s.length();i++){
            Integer count = 1;
            while(i<s.length()-1 && s.charAt(i) == s.charAt(i+1)){
                count++;
                i++;
            }
            result += s.charAt(i);
            if(count > 1){
                result += count.toString();
            }
        }
        for(int i=0;i<result.length();i++){
            chars[i] = result.charAt(i);
        }
        return result.length();
    }
}