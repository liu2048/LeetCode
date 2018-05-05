class Solution {
    public int singleNumber(int[] nums) {
        int rst = 0;
        for (int num : nums) {
            rst ^= num;
        }
        return rst;
    }
}
