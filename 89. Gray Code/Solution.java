public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> rst = new ArrayList<>();
        rst.add(0);
        for (int i = 1; i <= n; i++){
            int size = rst.size();
            for (int j = size - 1; j >= 0; j--){
                int add = 1 << (i-1);
                rst.add(add + rst.get(j));
            }
        }
        return rst;
    }
}

