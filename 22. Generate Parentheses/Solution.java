public class Solution {
    int n;
    List<String> rst;
    public List<String> generateParenthesis(int n) {
        this.n = n;
        this.rst = new LinkedList<>();
        dfs("(", 1, 0);
        return rst;
    }
    
    private void dfs(String tmp, int leftNum, int rightNum){
        if (leftNum > n || leftNum < rightNum) return;
        if (leftNum == rightNum && tmp.length() == 2 * n) {
            rst.add(tmp);
            return;
        }
        dfs(tmp + "(", leftNum + 1, rightNum);
        dfs(tmp + ")", leftNum, rightNum + 1);
    }
}