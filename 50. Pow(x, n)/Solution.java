public class Solution {
    public double myPow(double x, int n) {
        double rst = 0.0;
        if (n == 0) rst = 1.0;
        else{
            double half = myPow(x, n/2);
            if (n % 2 == 0) rst = half * half;
            else if (n > 0) rst = half * half * x;
            else rst = half / x * half;
        }
        return rst;
    }
}