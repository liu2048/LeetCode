public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if (nums == null) return 0;
        int len = nums.length;
        if (len < 3) return 0;
        int rst = nums[0] + nums[1] + nums[2];
        int global = Math.abs(rst - target);
        Arrays.sort(nums);
        for (int i = 0; i < len - 2; i++){
            int left = i + 1;
            int right = len - 1;
            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == target) return sum;
                int local = Math.abs(sum - target);
                if (local < global){
                    global = local;
                    rst = sum;
                }
                if (sum < target) left++;
                else right--;
            }
        }
        return rst;
    }
}