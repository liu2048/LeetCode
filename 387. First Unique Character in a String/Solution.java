class Solution {
    public int firstUniqChar(String s) {
        int len = s.length();
        int[] map = new int[26];
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            map[c - 'a']++;
        }
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            int n = map[c - 'a'];
            if (n == 1) return i;
        }
        return -1;
    }
}
