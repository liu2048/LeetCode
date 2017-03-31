public class Solution {
    int[] candidates;
    List<List<Integer>> rst;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        this.candidates = candidates;
        this.rst = new LinkedList<>();
        Arrays.sort(candidates);
        dfs(new LinkedList<>(), target, 0);
        return rst;
    }
    
    private void dfs(List<Integer> tmp, int curTarget, int curIndex){
        if (curTarget == 0){
            rst.add(new LinkedList<>(tmp));
        }
        else if (curTarget < 0) return;
        else{
            for (int i = curIndex; i < candidates.length; i++){
                int curNum = candidates[i];
                tmp.add(curNum);
                dfs(tmp, curTarget - curNum, i + 1);
                tmp.remove(tmp.size() - 1);
                while (i < candidates.length - 1 && curNum == candidates[i+1]) i++;
            }
        }
    }
}