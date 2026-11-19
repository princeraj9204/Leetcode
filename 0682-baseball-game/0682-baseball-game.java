class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                st.pop();
            }
            else if(operations[i].equals("D")){
                int a = st.peek();
                a = 2*a;
                st.push(a);
            }
            else if(operations[i].equals("+")){
                int a1 = st.pop();
                int a2 = st.peek();
                st.push(a1);
                int a3 = a1+a2;
                st.push(a3);
            }
            else {
                int x = Integer.parseInt(operations[i]);
                st.push(x);
            }
        }
        int sum = 0;
        for(int x:st){
            sum += x;
        }
        return sum;
    }
}