class Solution {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        for (int i = 0; i < len; i += 2 * k) {
            reverse(chars, i, Math.min(len, i+k) - 1);
        }
        return new String(chars);        
    }
    public void reverse(char[] chars, int begin, int end) {
        int len = end - begin + 1;
        for (int i = 0; i < len / 2; i++) {
            char temp = chars[begin + i];
            chars[begin + i] = chars[end - i];
            chars[end - i] = temp;
        }
    }
}
