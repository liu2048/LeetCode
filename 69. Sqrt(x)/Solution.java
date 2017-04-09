public class Solution {
    public int mySqrt(int x) {
        int low = 0;
        int high = x;
        while (low <= high){
            long mid = (low + high)/2;
            long mid_square = mid * mid;
            if (mid_square == x) return (int) mid;
            else if (mid_square < x) low = (int) mid + 1;
            else high = (int) mid - 1;
        }
        return high;
    }
}