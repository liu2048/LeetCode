class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> rst = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i])-1;
            if (nums[index] < 0) {
                rst.add(index+1);
            } else {
                nums[index] = -nums[index];
            }
        }
        return rst;
    }
}
