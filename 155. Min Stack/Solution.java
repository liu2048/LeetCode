class MinStack {
    private Stack<Integer> st;
    private Stack<Integer> minSt = new Stack<>();

    /** initialize your data structure here. */
    public MinStack() {
        this.st = new Stack<>();
        this.minSt = new Stack<>();
    }
    
    public void push(int x) {
        st.push(x);
        if (minSt.isEmpty()) {
            minSt.push(x);
        } else {
            int min = minSt.peek();
            minSt.push(Math.min(min, x));
        }        
    }
    
    public void pop() {
        st.pop();
        minSt.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minSt.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
