class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int nextgr[] = new int[nums2.length];
        Stack<Integer> st = new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
            while(!st.isEmpty() && nums2[i] >= nums2[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                nextgr[i] = -1;
            }else {
                nextgr[i] = nums2[st.peek()];
            }
            st.push(i);
        }
        int ans[] = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int a = nums1[i];
            for(int j=0;j<nums2.length;j++){
                if(a == nums2[j]){
                    ans[i] = nextgr[j];
                }
            }
        }
        return ans;
    }
}