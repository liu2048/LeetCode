public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rst = new LinkedList<>();
        if (numRows < 1) return rst;
        List<Integer> pre = new ArrayList<>();
        pre.add(1);
        rst.add(pre);
        for (int i = 2; i <= numRows; i++){
            List<Integer> cur = new ArrayList<>();
            cur.add(1);
            for (int j = 1; j < pre.size(); j++){
                cur.add(pre.get(j-1) + pre.get(j));
            }
            cur.add(1);
            rst.add(cur);
            pre = cur;
        }
        return rst;
    }
}