class Solution {
    public String reverseString(String s) {        
        char[] chars = s.toCharArray();
        int len = chars.length;
        for (int i = 0; i < len/2; i++) {
            char c = chars[i];
            chars[i] = chars[len-1-i];
            chars[len-1-i] = c;
        }
        return new String(chars);
    }
}
