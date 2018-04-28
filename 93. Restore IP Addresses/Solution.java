public class Solution {
    List<String> rst;
    String s;
    int len;
    public List<String> restoreIpAddresses(String s) {
        this.rst = new LinkedList<>();
        this.s = s;
        this.len = s.length();
        if (len < 4 || len > 12) return rst;
        dfs(0, 0, new StringBuilder());
        return rst;
    }
    private void dfs(int count, int index, StringBuilder sb){
        if (count == 4 && index == len){
            sb.deleteCharAt(sb.length()-1);
            rst.add(sb.toString());
            return;
        }
        for (int i = 1; i <= 3 && index + i <= s.length(); i++){
            String tempStr = s.substring(index, index + i);
            if (isValid(tempStr)){
                int bt = sb.length();
                int ed = bt + tempStr.length();
                sb.append(tempStr + ".");
                dfs(count+1, index+i, sb);
                sb.delete(bt, ed+1);
            }
        }
    }
    private boolean isValid(String s){
        if (s.charAt(0) == '0') return s.equals("0");
        int num = Integer.parseInt(s);
        return num > 0 && num < 256;
    }
}