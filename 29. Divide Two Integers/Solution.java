public class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == 0 || divisor == 0) return 0;
        
        boolean isNeg = (dividend > 0) ^ (divisor > 0);
                
        long a = dividend;
        long b = divisor;
        long quotient = 0;
        
        if (a < 0) a = -a;
        if (b < 0) b = -b;
        
        while (a >= b){
            long count = 1;
            long temp = b;
            while ( a >= temp + temp){
                temp += temp;
                count += count;
            }
            a -= temp;
            quotient += count;
        }
        
        if (isNeg) quotient = -quotient;
        if (quotient > Integer.MAX_VALUE) quotient = Integer.MAX_VALUE;
        if (quotient < Integer.MIN_VALUE) quotient = Integer.MIN_VALUE;
        
        return (int)quotient;
    }
}