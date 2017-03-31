public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> rst = new LinkedList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs){
            char[] cha = str.toCharArray();
            Arrays.sort(cha);
            String key = new String(cha);
            List<String> list = map.get(key);
            if (list == null) list = new LinkedList<>();
            list.add(str);
            map.put(key, list);
        } 
        for (String key : map.keySet()){
            List<String> tmp = map.get(key);
            rst.add(tmp);
        }
        return rst;
    }
}