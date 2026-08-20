class MinStack {
    Stack<Integer> s;
    Stack<Integer> s1;

    public MinStack() {
        s = new Stack<>();
        s1 = new Stack<>();
    }
    
    public void push(int value) {
        s.push(value);
        if(s1.isEmpty() || s1.peek()>=value){
            s1.push(value);
        }
    }
    
    public void pop() {
        if(s.peek().equals(s1.peek())){
            s1.pop();
        }
        s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return s1.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */