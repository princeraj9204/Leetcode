class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for(int i=0;i<s.length();i++){
            int reverse = 27-(s.charAt(i)-'a'+1);
            int b = i+1;
            int pro = reverse*b;
            sum += pro;
        }
        return sum;
    }
}