public class Solution_recursion {
    public List<Integer> grayCode(int n) {
        if (n == 0){
            List<Integer> rst = new ArrayList<>();
            rst.add(0);
            return rst;
        }
        List<Integer> temp = grayCode(n - 1);
        List<Integer> rst = new ArrayList<>(temp);
        int high_bit = 1 << (n-1); // 1 00...00, n-1 zeros 
        
        for (int i = temp.size() - 1; i >= 0; i--){
            rst.add(high_bit + temp.get(i));
        }
        return rst;
    }
}