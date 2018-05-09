class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> rst = new LinkedList<>();
        Map<String, Integer> map = new HashMap<>();
        int len = s.length();
        for (int i = 0; i < len-9; i++) {
            String str = s.substring(i, i+10);            
            if (map.containsKey(str)) {
                int count = map.get(str);
                if (count == 1) {
                    rst.add(str);
                }
                count++;
                map.put(str, count);                       
            } else {
                map.put(str, 1);
            }
        }   
        return rst;
    }
}
