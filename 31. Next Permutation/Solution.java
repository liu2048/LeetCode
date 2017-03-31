public class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length < 2) return;
        int i = nums.length - 2;
        while (i > -1 && nums[i] >= nums[i + 1]) i--;
        
        if (i != -1){
            int j = i + 1;
            while (j < nums.length && nums[j] > nums[i]) j++;
            swap(nums, i, j-1);
        }
        reverse(nums, i + 1);
    }
    private void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    private void reverse(int[] nums, int start){
        int l = start, r = nums.length - 1;
        while (l < r){
            swap(nums, l, r);
            l++; 
            r--;
        }
    } 
    
}