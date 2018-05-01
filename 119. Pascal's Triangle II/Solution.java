class Solution {
    public List<Integer> getRow(int rowIndex) {
        int[] row = new int[rowIndex+1];
        row[0] = 1;        
        for (int i = 1; i <= rowIndex; i++) {           
            for (int j = i-1; j > 0; j--) {                
                row[j] = row[j] + row[j-1];                
            }      
            row[i] = 1;            
        }
        List<Integer> list = new LinkedList<>();
        for (int i : row) {
            list.add(i);
        }
        return list;        
    }
}
