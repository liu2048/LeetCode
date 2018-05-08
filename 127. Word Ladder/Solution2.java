class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        if (!wordSet.contains(endWord)) return 0;
        if (wordSet.contains(beginWord)) wordSet.remove(beginWord);
        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);
        int layer = 1;
        while (!q.isEmpty()) {
            layer++;
            Queue<String> next = new LinkedList<>();
            for (String cur : q){
                for (int i = 0; i < cur.length(); i++) {
                    char[] chas = cur.toCharArray();
                    for (char j = 'a'; j <= 'z'; j++) {
                        chas[i] = j;
                        String str = new String(chas);                        
                        if (endWord.equals(str)) {
                            return layer;
                        }
                        if (wordSet.contains(str)) {                            
                            next.offer(str);
                            wordSet.remove(str);
                        }
                    }
                }
            }
            q = next;               
        }
        return 0;
    }
}
