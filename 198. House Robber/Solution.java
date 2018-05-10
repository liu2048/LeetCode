class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 0) return 0;
        int[] rst = new int[len+1];
        rst[0] = 0;
        rst[1] = nums[0];
        for (int i = 1; i < len; i++) {
            if (nums[i] + rst[i-1] > rst[i]) {
                rst[i+1] = nums[i] + rst[i-1];
            } else {
                rst[i+1] = rst[i];
            }            
        }
        return rst[len];
    }
}
