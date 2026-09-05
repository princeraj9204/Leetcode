class Solution {
    public int firstMissingPositive(int[] nums) {
       Set<Integer> set = new TreeSet<Integer>();
       for(int n:nums){
        if(n > 0){
            set.add(n);
        }
       }
       int missing = 1;
       for(int n:set){
        if(n!=missing){
            return missing;
        }
        missing++;
       }
       return missing;
    }
}