public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> rst = new ArrayList<>();
        if (rowIndex < 0) return rst;
        rst.add(1);
        for (int i = 1; i <= rowIndex; i++){
            for (int j = rst.size() - 1; j > 0; j--){
                rst.set(j, rst.get(j) + rst.get(j-1));
            }
            rst.add(1);
        }
        return rst;
    }
}

// List.set(index, value);