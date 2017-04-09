public class Solution {
    public int lengthOfLastWord(String s) {
        if (s == null) return 0;
        int len = s.length();
        if(len == 0) return 0;
        
        int lastLen = 0;
        
        while (len >= 1 && s.charAt(len - 1) == ' ') len--;
        
        while (lastLen < len && s.charAt(len - 1 - lastLen) != ' ') lastLen++;
        
        return lastLen;
    }
}