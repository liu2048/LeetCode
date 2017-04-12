public class Solution {
    public String simplifyPath(String path) {
        String[] string_array = path.split("/");
        StringBuilder sb = new StringBuilder("/");
        String rst_str = "/";
        Stack<String> st = new Stack<>();
        for (String str : string_array){
            if (str.equals("..")) if (!st.isEmpty()) st.pop(); // ".." means to return to upper level   
            else if (!str.equals("") && !str.equals(".")) st.push(str);
        }
        for (String str : st) {
            sb.append(str);
            sb.append("/");
        }
        if (sb.length() > 1) {
            sb.deleteCharAt(sb.length() - 1); // likely, sb.delete(sb.length() - 1, sb.length())
            rst_str = sb.toString();
        }
        return rst_str;
    }
}