class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> s = new Stack<>();
        int nextgr[] = new int[nums.length];
        for(int i = (n*2)-1 ;i>=0;i--){
            while(!s.isEmpty() && nums[s.peek()]<=nums[i%n]){
                s.pop();
            }
            if(s.isEmpty()){
                nextgr[i%n] = -1;
            }else {
                nextgr[i%n] = nums[s.peek()];
            }
            s.push(i%n);
        }
        return nextgr;
    }
}