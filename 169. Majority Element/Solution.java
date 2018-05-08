class Solution {
    public int majorityElement(int[] nums) {
        int rst = 0;
        int count = 0;
        for (int n : nums) {
            if (count == 0) {
                rst = n;
                count = 1;
            } else {
                if (rst == n) {
                    count++;
                } else {
                    count--;
                }
            }            
        }
        return rst;
    }
}
