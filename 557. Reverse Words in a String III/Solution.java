class Solution {
    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            StringBuilder temp = new StringBuilder(str);
            temp.reverse();
            sb.append(temp);
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();        
    }
}
