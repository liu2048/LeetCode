public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        
        int len1 = a.length();
        int len2 = b.length();
        int i = len1 - 1, j = len2 - 1;
        if (len1 < len2){
            String tmp = a;
            a = b;
            b = tmp;
            i = len2 - 1;
            j = len1 - 1;
        }
        int digit = 0;
        int carry = 0;
        while (j > -1){
            int x = a.charAt(i) - '0';
            int y = b.charAt(j) - '0';
            int sum = x + y + carry;
            digit = sum % 2;
            carry = sum / 2;
            sb.append(digit);
            i--;
            j--;
        }
        while (i > -1){
            int x = a.charAt(i) - '0';
            int sum = x + carry;
            digit = sum % 2;
            carry = sum / 2;
            sb.append(digit);
            i--;
        }
        if (i == -1 && carry == 1) sb.append(1);
        return sb.reverse().toString();
    }
}