class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if (!map.containsKey(sc)) {
                map.put(sc, tc);
            } else {
                if (map.get(sc) != tc) {
                    return false;
                }                
            }
        }        
        map = new HashMap<>();
        String temp = s;
        s = t;
        t = temp;
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if (!map.containsKey(sc)) {
                map.put(sc, tc);
            } else {
                if (map.get(sc) != tc) {
                    return false;
                }                
            }
        }        
        return true;
    }
}
