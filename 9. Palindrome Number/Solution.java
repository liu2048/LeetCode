public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int highest = 1;
        while (x / highest >= 10) highest *= 10;
        while ( x != 0){
            int left = x / highest;
            int right = x % 10;
            if (left != right) return false;
            x = (x % highest) / 10;
            highest /= 100;
        }
        return true;
    }
}