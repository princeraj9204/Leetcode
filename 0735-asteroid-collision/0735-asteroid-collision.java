class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        int n = asteroids.length;
        for(int i=0;i<n;i++){
            int curr = asteroids[i];
            boolean b = true;
            while(!st.isEmpty() && st.peek() > 0 && curr < 0){
                if(Math.abs(st.peek()) < Math.abs(curr)){
                    st.pop();
                }
                else if(Math.abs(st.peek()) == Math.abs(curr)){
                    st.pop();
                    b = false;
                    break;
                }
                else {
                    b = false;
                    break;
                }
            }
            if(b){
                st.push(curr);
            }
        }
        int ans[] = new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            ans[i] = st.pop();
        }
        return ans;
    }
}