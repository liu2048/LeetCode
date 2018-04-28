// dynamic programming
public class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null) return 0;
        int len = nums.length;
        // rst[i] means local maximum sum of contiguous subarray which contains nums[i]
        int[] rst = new int[len];
        rst[0] = nums[0];
        for (int i = 1; i < len; i++){
            // rst[i] = Math.max(nums[i], nums[i]+rst[i-1]);
            if (nums[i] + rst[i-1] > nums[i]){
                rst[i] = rst[i-1] + nums[i];
            }
            else{
                rst[i] = nums[i];
            }
        }
        int max = rst[0];
        for (int i = 1; i < len; i++){
            if (rst[i] > max){
                max = rst[i];
            }
        }
        return max;
    }
}

// two variables, global & local. A variety of dp
public class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int local = nums[0];
        int global = local;
        for (int i = 1; i < nums.length; i++){
            int cur = nums[i];
            local = Math.max(cur, cur + local);
            global = Math.max(global, local);
        }
        return global;
    }
}