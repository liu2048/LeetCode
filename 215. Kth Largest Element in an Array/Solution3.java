class Solution {
    public int findKthLargest(int[] nums, int k) {
        quickSort(nums, 0, nums.length-1);        
        return nums[k-1];
    }
    // QuickSort pick leftmost as pivot value, and sort in descending order
    public void quickSort(int[] nums, int left, int right) {
        if (left >= right) return;
        int i = left;
        int j = right;
        int pivot = nums[i];
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
