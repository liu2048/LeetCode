class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : words) {
            if (map.containsKey(s)) {
                map.put(s, 1 + map.get(s));
            } else {
                map.put(s, 1);
            }
        }
        Queue<KeyFre> pq = new PriorityQueue<>(k);
        for (String key : map.keySet()) {
            KeyFre keyFre = new KeyFre(key, map.get(key));
            if (pq.size() < k) {
                pq.offer(keyFre);
            } else {
                KeyFre top = pq.peek();
                if (keyFre.compareTo(top) > 0) {
                    pq.poll();
                    pq.offer(keyFre);
                }
            }
        }
        List<String> list = new LinkedList<>();
        while (!pq.isEmpty()) {
            list.add(0, pq.poll().key);
        }
        return list;
    }
    
}

class KeyFre implements Comparable<KeyFre>{
    String key;
    int fre;
    public KeyFre(String key, int fre) {
        this.key = key;
        this.fre = fre;
    }
    @Override
    public int compareTo(KeyFre that) {
        if (this.fre == that.fre) return that.key.compareTo(this.key);
        return this.fre - that.fre;
    }
}
