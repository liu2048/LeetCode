public class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len < 2) return len;
        int i = 0;
        for (int j = 1; j < len; j++){
            if (nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}