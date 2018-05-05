class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {        
        Set<String> wordSet = new HashSet<>(wordList);  
        Set<String> toVisit = new HashSet<>();  
        toVisit.add(beginWord);        
        int count = 1;        
        while (!toVisit.contains(endWord)) {
            Set<String> next = new HashSet<>();            
            for (String word : toVisit) { 
                for (int j = 0; j < word.length(); j++) {
                    char[] chas = word.toCharArray();
                    for (char k = 'a'; k <= 'z'; k++) {
                        chas[j] = k;
                        String str = new String(chas);                        
                        if (wordSet.contains(str)) {                            
                            wordSet.remove(str);
                            next.add(str);
                        }
                    }                    
                }    
            }
            count++;
            if (next.size() == 0) { // it nevert get to the endWord
                return 0;
            }            
            toVisit = next;                          
        }
        return count;        
    }    
}
