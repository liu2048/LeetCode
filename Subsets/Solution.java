public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> rst = new ArrayList<>();
        rst.add(new LinkedList<>());
        for (int num : nums){
            int size = rst.size(); // store current size of rst, do not use rst.size() in the following line
            for (int j = 0; j < size; j++){
                List<Integer> list = new LinkedList<>(rst.get(j)); // rst.get(j) instead of rst.get(j).add(num)
                list.add(num);
                rst.add(list);
            }
        }
        return rst;
    }
}