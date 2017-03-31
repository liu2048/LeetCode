public class Solution {
    public int myAtoi(String str) {
        if (str == null) return 0;
        str = str.trim();
        int len = str.length();
        if (len < 1) return 0;
        int index = 0;
        boolean isNeg = false;
        long rst = 0;
        if (str.charAt(0) == '+') index++;
        else if (str.charAt(0) == '-') {
            index++;
            isNeg = true;
        }
        
        if (!isNeg){
            while (index < len){
                char c = str.charAt(index);
                if (c >= '0' && c <= '9') rst = 10 * rst + (c - '0');
                else break;
                if (rst > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                index++;
            }
        }
        else{
            while (index < len){
                char c = str.charAt(index);
                if (c >= '0' && c <= '9') rst = 10 * rst - (c - '0');
                else break;
                if (rst < Integer.MIN_VALUE) return Integer.MIN_VALUE;
                index++;
            }
        }
        return (int)rst;
    }
}