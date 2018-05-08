class Solution {
    public int titleToNumber(String s) {
        int rst = 0;
        for (char c : s.toCharArray()) {
            int bit = c - 'A' + 1;
            rst = rst * 26 + bit;
        }
        return rst;
    }
}
