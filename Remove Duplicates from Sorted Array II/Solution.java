public class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int index = 0;
        int count = 1;
        for (int i = 1; i < len; i++){
            int cur = nums[i];
            if (nums[index] != cur){
                count = 1;
                index++;
                nums[index] = cur;
            }
            else {
                if (count < 2){
                    index++;
                    nums[index] = cur;
                    count++;
                }
            }
        }
        return index + 1;
    }
}

/*
// another version
public class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int index = 0;
        int count = 1;
        for (int i = 1; i < len; i++){
            int cur = nums[i];
            if (nums[index] == cur){
                count++;
                if (count > 2) continue;
            }
            else count = 1;
            nums[++index] = cur;
        }
        return index + 1;
    }
}
*/