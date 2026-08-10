class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int nextgr[] = new int[nums2.length];
        Stack<Integer> s = new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
            while(!s.isEmpty() && nums2[s.peek()] <= nums2[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextgr[i] = -1;
            }else {
                nextgr[i] = nums2[s.peek()];
            }
            s.push(i);
        }
       // return nextgr;
        int ans[] = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int a = nums1[i];
            for(int j=0;j<nums2.length;j++){
                if(nums2[j] == a){
                    ans[i] = nextgr[j];
                }
            }
        }
        return ans;
    }
}