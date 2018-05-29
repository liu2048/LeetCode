class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 0 ) {
                count++;
            } else {
                nums[i-count] = nums[i];
            }
        }
        for (int i = 0; i < count; i++) {
            nums[len-1-i] = 0;
        }
    }
}
