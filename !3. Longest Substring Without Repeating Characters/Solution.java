public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int index = 0;
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (map.containsKey(c)) index = Math.max(index, map.get(c) + 1);
            map.put(c, i);
            maxLen = Math.max(maxLen, i - index + 1);
        }
        return maxLen;
    }
}