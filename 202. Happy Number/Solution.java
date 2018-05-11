class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        set.add(n);
        while (n != 1) {
            n = sumSquaredDigits(n);
            if (set.contains(n)) {
                return false;
            } else {
                set.add(n);
            }
        }
        return true;        
    }
    public int sumSquaredDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += Math.pow(n%10, 2);
            n /= 10;
        }
        return sum;
    }
}
