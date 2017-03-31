public class Solution {
    public int reverse(int x) {
        long rst = 0;
        int digit = 0;
        while (x != 0){
            digit = x % 10;
            rst = rst * 10 + digit;
            x /= 10;
        }
        if (rst > Integer.MAX_VALUE || rst < Integer.MIN_VALUE) return 0;
        return (int)rst;
    }
}