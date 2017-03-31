public class Solution {
    String digits;
    List<String> rst;
    HashMap<Character, char[]> hm;
    StringBuilder sb;
    public List<String> letterCombinations(String digits) {
         this.digits = digits;
         this.rst = new LinkedList<>();
         if (digits == null || digits.length() == 0) return rst;
         this.hm = new HashMap<>();
         this.sb = new StringBuilder();
         hm.put('0', new char[]{});
         hm.put('1', new char[]{});
         hm.put('2', new char[]{'a','b','c'});
         hm.put('3', new char[]{'d','e','f'});
         hm.put('4', new char[]{'g','h','i'});
         hm.put('5', new char[]{'j','k','l'});
         hm.put('6', new char[]{'m','n','o'});
         hm.put('7', new char[]{'p','q','r','s'});
         hm.put('8', new char[]{'t','u','v'});
         hm.put('9', new char[]{'w','x','y','z'});
         dfs();
         return rst;
    }
    private void dfs(){
        int len = sb.length();
        if (len == digits.length()) rst.add(sb.toString());
        else{
            char key = digits.charAt(len);
            char[] chaArr = hm.get(key);
            for (char c : chaArr){
                sb.append(c);
                dfs();
                sb.deleteCharAt(len);
            }
        }
    }
}