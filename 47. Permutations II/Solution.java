public class Solution {
    int[] nums;
    List<List<Integer>> rst;
    boolean[] used;
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        this.nums = nums;
        this.rst = new LinkedList<>();
        this.used = new boolean[nums.length];
        dfs(new LinkedList<>());
        return rst;
    }
    private void dfs(List<Integer> tmp){
        if (tmp.size() == nums.length) {
            rst.add(new LinkedList<>(tmp));
            return;
        }
        for (int i = 0; i < nums.length; i++){
            if (!used[i]){
                tmp.add(nums[i]);
                used[i] = true;
                dfs(tmp);
                used[i] = false;
                tmp.remove(tmp.size() - 1);
                while (i < nums.length - 1 && nums[i] == nums[i+1]) i++;
            }
        }
    }
}