public class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        String x = new StringBuilder(num1).reverse().toString();
        String y = new StringBuilder(num2).reverse().toString();
        int len1 = num1.length();
        int len2 = num2.length();
        int[] d = new int[len1 + len2];
        for (int i = 0; i < len1; i++){
            for (int j = 0; j < len2; j++){
                int a = x.charAt(i) - '0';
                int b = y.charAt(j) - '0';
                d[i+j] += a * b;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int k = 0; k < len1 + len2; k++){
            int digit = d[k] % 10;
            int carry = d[k] / 10;
            if (k < len1 + len2 -1) d[k + 1] += carry;
            sb.insert(0, digit);
        }
        if (sb.charAt(0) == '0') sb.deleteCharAt(0);
        return sb.toString();
    }
}