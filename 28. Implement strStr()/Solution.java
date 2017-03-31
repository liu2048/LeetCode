public class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) return -1;
        int len1 = haystack.length();
        int len2 = needle.length();
        for (int i = 0; i < len1 - len2 + 1; i++){
            int j = 0;
            while (j < len2 && haystack.charAt(i+j) == needle.charAt(j)) j++;
            if (j == len2) return i;
        }
        return -1;
    }
}