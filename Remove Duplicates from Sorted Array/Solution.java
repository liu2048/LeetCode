public class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len < 2) return len;
        int index = 0;
        for (int i = 1; i < len; i++) {
            int cur = nums[i];
            if (nums[index] != cur) {
                index++;
                nums[index] = cur;
            }
        }
        return index + 1;
    }
}