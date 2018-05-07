class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {            
            int bit = (n-1) % 26;
            char c = (char) ('A' + bit);            
            n = (n-1) / 26;
            sb.insert(0, c);
        }        
        return sb.toString();
    }
}
