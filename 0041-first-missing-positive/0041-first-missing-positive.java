class Solution {
    public int firstMissingPositive(int[] nums) {
       Set<Integer> set = new TreeSet<Integer>();
       for(int n:nums){
        if(n>0) set.add(n);
       }
       int c = 1;
       for(int n: set){
        if(c != n) return c;
        c++;
       }
       return c;
    }
}