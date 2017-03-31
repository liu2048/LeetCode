public class Solution {
    public boolean isValid(String s) {
        if (s == null) return false;
        int len = s.length();
        if (len % 2 != 0) return false;
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < len; i++){
            char cur = s.charAt(i);
            if (cur == '(' || cur == '[' || cur == '{'){
                st.push(cur);
            }
            else {
                if (st.isEmpty()) return false;
                else {
                    char top = st.pop();
                    if (top == '(' && cur != ')' || top == '[' && cur != ']' || top == '{' && cur != '}') return false;
                }
            }
        }
        return st.isEmpty();
    }
}