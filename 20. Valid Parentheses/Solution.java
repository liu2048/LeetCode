class Solution {
    public boolean isValid(String s) {
        int len = s.length();
        Stack<Character> st = new Stack<>();
        for (char cur : s.toCharArray()) {
            if (cur == '(' || cur == '['|| cur == '{') st.push(cur);
            else {
                if (st.isEmpty()) return false;
                else {
                    char top = st.pop();
                    if (top == '(' && cur != ')') return false;
                    if (top == '[' && cur != ']') return false;
                    if (top == '{' && cur != '}') return false;
                }
            }
        }
        return st.isEmpty();
    }
}
