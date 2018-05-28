class Solution {
    public int findKthLargest(int[] nums, int k) {
        quickSort(nums, 0, nums.length-1);
        return nums[k-1];
    }
    public void quickSort(int[] nums, int left, int right) {
        if (left >= right) return;
        int index = (int) Math.random() * (right-left+1) + left;
        int pivot = nums[index];
        swap(nums, left, index);
        int i = left, j = right;       
        while (i < j) {
            while (nums[j] < pivot) j--;
            while (nums[i] >= pivot && i < j) i++;
            if (i < j) swap(nums, i, j);
        }
        swap(nums, left, i);
        quickSort(nums, left, i-1);
        quickSort(nums, i + 1, right);
    }
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
