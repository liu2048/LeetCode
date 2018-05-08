class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k %= len;
        reverse(0, len-k-1, nums);
        reverse(len-k, len-1, nums);
        reverse(0, len-1, nums);                
    }
    public void reverse(int begin, int end, int[] nums) {
        if (begin == end) return;
        while (begin < end) {
            int temp = nums[begin];
            nums[begin] = nums[end];
            nums[end] = temp;
            begin++;
            end--;
        }
    }
}
