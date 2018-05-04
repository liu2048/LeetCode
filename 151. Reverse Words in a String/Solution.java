public class Solution {
    public String reverseWords(String s) {
        if (s == null || s.length() == 0) return "";
        String[] array = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {  
            String str = array[i];
            if (!str.equals("")){
                sb.append(" ").append(str);
            }                        
        }
        return sb.delete(0, 1).toString();        
    }
}
