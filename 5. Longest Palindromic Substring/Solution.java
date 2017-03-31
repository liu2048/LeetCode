public class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";
        int maxLen = 1;
        int index = 0;
        for (int i = 0; i < s.length() - 1; i++){
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > maxLen) {
                maxLen = len;
                index = i;
            }
        } 
        return s.substring(index - (maxLen-1) / 2, index + maxLen / 2 + 1);
    }
    
    private int expandAroundCenter(String s, int left, int right){
        int length = 0;
        while (left > -1 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;
    }
}