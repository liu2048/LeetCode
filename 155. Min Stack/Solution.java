class MinStack {
    Stack<Integer> st, minSt;
    int curMin;

    /** initialize your data structure here. */
    public MinStack() {
        st = new Stack<>();
        minSt = new Stack<>();
        curMin = 0;
    }
    
    public void push(int x) {
        st.push(x);
        if (!minSt.isEmpty()) { 
            if (x < curMin) {
                curMin = x;  
            }             
        } else {
            curMin = x;                                  
        } 
        minSt.push(curMin); 
    }
    
    public void pop() {
        st.pop();
        minSt.pop();
        if (!minSt.isEmpty()) {
            curMin = minSt.peek();
        }        
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return curMin;
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
