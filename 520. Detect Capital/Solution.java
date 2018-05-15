class Solution {
    public boolean detectCapitalUse(String word) {
        char[] chars = word.toCharArray();
        int len = word.length();
        int numOfUpper = 0;
        for (char c : chars) {
            if (c >= 'A' && c <= 'Z') {
                numOfUpper++;
            }
        }
        if (numOfUpper == 0) return true;
        if (numOfUpper == len) return true;        
        if (Character.isUpperCase(chars[0]) && numOfUpper == 1) return true;
        return false;
    }
}
