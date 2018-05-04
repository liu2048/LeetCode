class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        Set<String> set = new HashSet<>();
        set.add("+");
        set.add("-");
        set.add("*");
        set.add("/");
        for (String token : tokens) {
            if (set.contains(token)) {
                int c = 0;
                int b = st.pop();
                int a = st.pop();   
                if (token.equals("+")) {
                    c = a + b;
                } else if (token.equals("-")) {
                    c = a - b;
                } else if (token.equals("*")) {
                    c = a * b;
                } else if (token.equals("/")) {
                    c = a / b;
                }
                st.push(c); 
            } else {   
                st.push(Integer.parseInt(token));                              
            }
        }
        return st.peek();
    }
}
