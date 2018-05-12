class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        
        int len = nums.length;        
        int last = nums[0];   
        int cur = Math.max(nums[0], nums[1]);
        for (int i = 2; i < len; i++) {
            int temp = cur;
            cur = Math.max(cur, last + nums[i]);
            last = temp;
        }
        return cur;
    }
}
