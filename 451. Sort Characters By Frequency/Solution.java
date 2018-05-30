class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxFre = 1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                int fre = 1 + map.get(c);
                map.put(c, fre);
                maxFre = Math.max(maxFre, fre);
            } else {
                map.put(c, 1);
            }
        }
        StringBuilder[] buckets = new StringBuilder[maxFre + 1];
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            char c = e.getKey();
            int fre = e.getValue();
            if (buckets[fre] == null) {
                buckets[fre] = new StringBuilder();
            }
            buckets[fre].append(c);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = maxFre; i >= 0; i--) {
            StringBuilder cur = buckets[i];
            if (cur != null) {
                for (int j = 0; j < cur.length(); j++) {
                    char c = cur.charAt(j);
                    for (int k = 0; k < i; k++) {
                        sb.append(c);
                    }
                }                                
            }            
        }
        return sb.toString();
    }
}
