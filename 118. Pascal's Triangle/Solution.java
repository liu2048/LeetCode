class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rst = new LinkedList<>();
        if (numRows < 1) return rst;            
        List<Integer> list = new ArrayList<>();
        list.add(1);
        rst.add(list);        
        List<Integer> pre = list;
        for (int i = 2; i <= numRows; i++) {
            List<Integer> cur = new ArrayList<>();
            cur.add(1);
            for (int j = 1; j <= i-2; j++) {
                cur.add(pre.get(j-1) + pre.get(j));
            }
            cur.add(1);
            rst.add(cur);
            pre = cur;
        }
        return rst;
    }
}
