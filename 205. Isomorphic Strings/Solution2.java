class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int len = s.length();
        int[] sMap = new int[256];
        int[] tMap = new int[256];        
        for (int i = 0; i < len; i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (sMap[sChar] == 0 && tMap[tChar] == 0) {
                sMap[sChar] = tChar;
                tMap[tChar] = sChar;
            } else {
                if (sMap[sChar] != tChar || tMap[tChar] != sChar) {
                    return false;
                }
            }
        }
        return true;
    }
}
