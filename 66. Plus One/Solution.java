public class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int carry = 1;
        int index = len - 1;
        while (index > -1){
            digits[index] += carry;
            if (digits[index] == 10){
                digits[index] = 0;
                carry = 1;
            } else {
                carry = 0;
                break;
            }
            index--;
        }
        if (carry != 0){
            int[] rst = new int[len + 1];
            rst[0] = 1;
            System.arraycopy(digits, 0, rst, 1, len);
            return rst;
        }
        return digits;
    }
}