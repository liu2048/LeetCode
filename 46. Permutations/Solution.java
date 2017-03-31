public class Solution {
    int[] nums;
    List<List<Integer>> rst;
    boolean[] used;
    public List<List<Integer>> permute(int[] nums) {
        this.nums = nums;
        this.rst = new LinkedList<>();
        this.used = new boolean[nums.length];
        dfs(new LinkedList<>());
        return this.rst;
    }
    private void dfs(List<Integer> tmp){
        if (tmp.size() == nums.length) rst.add(new LinkedList<>(tmp));
        else{
            for (int i = 0; i < nums.length; i++){
                if (!used[i]){
                    tmp.add(nums[i]);
                    used[i] = true;
                    dfs(tmp);
                    used[i] = false;
                    tmp.remove(tmp.size() - 1);
                }
            }
        }
    }
}