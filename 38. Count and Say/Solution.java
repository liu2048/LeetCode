public class Solution {
    public String countAndSay(int n) {
        String s = "1";
        while (--n > 0){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++){
                int count = 1;
                char cha = s.charAt(i);
                while(i < s.length() - 1 && cha == s.charAt(i+1)){
                    i++;
                    count++;
                }
                sb.append(count).append(cha);
            }
            s = sb.toString();
        }
        return s;
    }
}