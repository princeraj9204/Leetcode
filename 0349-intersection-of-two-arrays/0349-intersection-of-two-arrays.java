class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int num1:nums1){
            for(int num2:nums2){
                if(num1 == num2){
                    set.add(num1);
                }
            }
        }
        int ans[] =  new int[set.size()];
        int idx  =0;
        for(int num:set){
            ans[idx++] = num;
        }
        return ans;
    }
}