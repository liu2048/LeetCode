public class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            int left_num = nums[left];
            int mid_num = nums[mid];
            int right_num = nums[right];
            if (target == mid_num) return true;
            
            if (nums[left] == mid_num) left++;
            else if (left_num < mid_num){
                if (left_num <= target && target < mid_num){
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }
            else {
                if (mid_num < target && target <= right_num){
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }
        }
        return false;
    }
}