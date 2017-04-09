public class Solution {
    public String simplifyPath(String path) {
        StringBuilder sb = new StringBuilder("/");
        String rst = "/";
        String[] strs = path.split("/");
        Stack<String> st = new Stack<>();
        for (String str : strs){
            if (str.equals("..")){
                if (!st.isEmpty()) st.pop();
            }
            else if (!str.equals(".") && !str.equals("")) st.push(str);
        }
        for (String str : st) {
            sb.append(str);
            sb.append("/");
        }
        if (sb.length() > 1) {
            sb.delete(sb.length() - 1, sb.length());
            rst = sb.toString();
        }
        return rst;
    }
}