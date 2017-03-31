public class Solution {
    public String convert(String s, int numRows) {
        if (s == null) return s;
        if (numRows < 2) return s;
        int len = s.length();
        if (len < 2 || len == numRows) return s;
        int period = 2 * numRows - 2;
        StringBuilder sb = new StringBuilder();        
        for (int j = 0; j < len; j += period){
            char c = s.charAt(j);
            sb.append(c);
        }
        for (int i = 1; i < numRows - 1; i++){
            for (int j = i; j < len; j += period){                
                char c = s.charAt(j);
                sb.append(c);
                int index = j + period - 2 * i;
                if (index > 0 && index < len) {
                    c = s.charAt(index);
                    sb.append(c);
                }
            }
        }
        for (int j = numRows - 1; j < len; j += period){
            char c = s.charAt(j);
            sb.append(c);
        }
        return sb.toString();
    }
}