class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n < 0) return false;
        int bits = 0;
        int m = n;
        while (m > 0) {
            m >>= 1;
            bits++;
        }
        m = 1;
        m <<= (bits-1);
        return m == n ? true : false;
    }
}
