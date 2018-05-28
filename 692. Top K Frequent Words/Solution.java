class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            Integer freq = map.get(word);
            if (freq == null) {
                map.put(word, 1);
            } else {
                map.put(word, ++freq);
            }
        }
        Queue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(k, new comparator());
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (pq.size() < k) {
                pq.offer(e);
            } else {
                int fre1 = e.getValue();
                int fre2 = pq.peek().getValue();
                String s1 = e.getKey();
                String s2 = pq.peek().getKey();
                if (fre1 > fre2 || (fre1 == fre2 && s1.compareTo(s2) < 0)) {
                    pq.poll();
                    pq.offer(e);
                }
            }
        }
        List<String> rst = new LinkedList<>();
        while (!pq.isEmpty()) {
            rst.add(0, pq.poll().getKey());
        }
        return rst;
    }
    private class comparator implements Comparator<Map.Entry<String, Integer>> {
        @Override
        public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
            int f1 = e1.getValue();
            int f2 = e2.getValue();
            if (f1 == f2) {
                return e2.getKey().compareTo(e1.getKey());                
            } 
            return e1.getValue().compareTo(e2.getValue());
        }
    }
}
