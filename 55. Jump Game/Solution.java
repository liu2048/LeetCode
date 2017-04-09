public class Solution {
    public boolean canJump(int[] nums) {
        if (nums == null) return false;
        int len = nums.length;
        if (len < 2) return true;
        int step = nums[0];
        if (step == 0) return false;
        
        int max = step;
        for (int i = 1; i < len; i++){
            step--;
            if (i + nums[i] > max){
                max = i + nums[i];
                step = nums[i];
            }
            if (max >= len - 1) return true;
            if (step <= 0 && i < len - 1) return false;
        }
        return true;
    }
}