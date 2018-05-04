class Solution {
    String s;
    int len;
    List<String> cur;
    List<List<String>> rst;    
    public List<List<String>> partition(String s) {
        this.s = s;
        this.len = s.length();
        this.cur = new LinkedList<>();
        rst = new LinkedList<>();
        dfs(0);        
        return rst;
    }
    public void dfs(int start) {
        if (start == len) {
            List<String> list = new LinkedList<>(cur);
            rst.add(list);
            return;
        }
        for (int i = start; i < len; i++) {
            String str = s.substring(start, i+1);
            if (isPalindrom(str)) {
                cur.add(str);
                dfs(i+1);
                cur.remove(cur.size()-1);
            } 
        }        
    }
    public boolean isPalindrom(String s) {
        int length = s.length();
        if (length == 1) return true;
        for (int i = 0; i < length/2; i++) {
            if (s.charAt(i) != s.charAt(length-1-i)) {
                return false;
            }
        }
        return true;
    }
}
