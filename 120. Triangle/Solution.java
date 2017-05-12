public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int height = triangle.size();
        int[] rst = new int[height];
        List<Integer> lowestLevel = triangle.get(height-1);
        int size = lowestLevel.size();
        for (int i = 0; i < size; i++){
            rst[i] = lowestLevel.get(i);
        }
        for (int i = height-2; i > -1; i--){
            size--;
            List<Integer> curLevel = triangle.get(i);
            for (int j = 0; j < size; j++){
                rst[j] = curLevel.get(j) + Math.min(rst[j], rst[j+1]);
            }
        }
        return rst[0];
    }
}