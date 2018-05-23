class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int len = s.length();
        int i = 0;
        int j = 0;
        int maxLen = 0;
        while (j < len) {
            char c = s.charAt(j);
            if (map.containsKey(c)) {
                i = Math.max(i, map.get(c) + 1);    
            } 
            maxLen = Math.max(maxLen, j-i+1);
            map.put(c, j);
            j++;
        }
        return maxLen;
    }
}
