class Solution {
    public int compareVersion(String version1, String version2) {
        String[] s1 = version1.split("\\.");
        String[] s2 = version2.split("\\.");
        int len1 = s1.length;
        int len2 = s2.length;        
        int minLen = Math.min(len1, len2);
        for (int i = 0; i < minLen; i++) {
            int a = Integer.parseInt(s1[i]);
            int b = Integer.parseInt(s2[i]);            
            if (a > b) {
                return 1;
            } else if (a < b) {
                return -1;
            }
        }
        if (len1 > len2) {            
            for (int i = len2; i < len1; i++) {
                int a = Integer.parseInt(s1[i]);
                if (a != 0) {
                    return 1;
                }
            }
        } else if (len1 < len2) {
            for (int j = len1; j < len2; j++) {
                int b = Integer.parseInt(s2[j]);
                if (b != 0) {
                    return -1;
                }
            }
        }
        return 0;        
    }
}
