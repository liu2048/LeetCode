class Solution {
    public int firstUniqChar(String s) {
        int len = s.length();
        char[] chas = s.toCharArray();
        int[] map = new int[26];
        for (char c : chas) {           
            map[c - 'a']++;
        }
        int index = 0;
        for (char c : chas) {            
            int n = map[c - 'a'];
            if (n == 1) return index;
            index++;
        }
        return -1;
    }
}
