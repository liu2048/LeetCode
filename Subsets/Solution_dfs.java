// dfs solution
public class Solution_dfs {
    int[] nums;
    List<List<Integer>> rst;
    public List<List<Integer>> subsets(int[] nums) {
        this.nums = nums;
        this.rst = new LinkedList<>();
        dfs(0, new LinkedList<>());
        return this.rst;
    }
    private void dfs(int index, List<Integer> temp){
        if (index == nums.length){
            rst.add(new LinkedList<>(temp));
            return;
        }
        dfs(index + 1, temp);
        temp.add(nums[index]);
        dfs(index + 1, temp);
        temp.remove(temp.size() - 1);
    }
}