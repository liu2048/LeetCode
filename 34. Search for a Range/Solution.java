public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] rst = {-1, -1};
        if (nums == null || nums.length == 0) return rst;
        int left = 0;
        int right = nums.length - 1;
        while (left < right - 1){
            int mid = (left + right) / 2;
            if (nums[mid] < target) left = mid;
            else right = mid;
        }
        if (nums[left] == target) rst[0] = left;
        else if (nums[right] == target) rst[0] = right;
        else return rst;
        left = 0;
        right = nums.length - 1;
        while (left < right - 1){
            int mid = (left + right) / 2;
            if (nums[mid] > target) right = mid;
            else left = mid;
        } 
        if (nums[right] == target) rst[1] = right; // cannot switch with next line
        else if (nums[left] == target) rst[1] = left;
        else return rst;
        return rst;
    }
}