public class Solution {
    public void sortColors(int[] nums) {
        int len = nums.length;
        int left = 0, right = len - 1;
        for (int i = 0; i <= right; i++){
            int cur = nums[i];
            if (cur == 0){
                swap(nums, left, i);
                left++;
            }
            else if (cur == 2){
                swap(nums, right, i);
                right--;
                i--;
            }
        }
    }
    private void swap(int[] nums, int index_1, int index_2){
        int a = nums[index_1], b = nums[index_2];
        if (a != b){
            int temp = a;
            nums[index_1] = b;
            nums[index_2] = temp;
        }
    }
}