class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int depth = triangle.size();
        List<Integer> lastRow = triangle.get(depth - 1);
        int lastLen = lastRow.size();
        int[] nums = new int[lastLen];
        int count = 0;
        for (int i : lastRow) {
            nums[count] = i;
            count++;
        }
        for (int i = depth-2; i >= 0; i--) {            
            List<Integer> curRow = triangle.get(i);
            List<Integer> lowRow = triangle.get(i+1);            
            int size = curRow.size();
            for (int j = 0; j < size; j++) {
                int cur = curRow.get(j);
                int lowLeft = nums[j];
                int lowRight = nums[j+1];
                if (lowLeft < lowRight) {
                    nums[j] = lowLeft + cur;
                } else {
                    nums[j] = lowRight + cur;
                }
            }
        }
        return nums[0];
    }
}
