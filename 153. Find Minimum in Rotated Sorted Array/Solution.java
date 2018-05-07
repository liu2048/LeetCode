class Solution {
    public int findMin(int[] nums) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        while (leftIndex < rightIndex) {
            int left = nums[leftIndex];
            int right = nums[rightIndex];
            if (left < right) {
                return left;
            }
            int midIndex = leftIndex + (rightIndex - leftIndex) / 2;
            if (nums[midIndex] >= left) {
                leftIndex = midIndex + 1;
            } else {
                rightIndex = midIndex;
            }
        }
        return nums[leftIndex];
    }
}
