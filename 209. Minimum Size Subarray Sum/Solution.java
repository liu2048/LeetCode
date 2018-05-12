class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int fast = 0;
        int slow = 0;
        int sum = 0;
        int len = nums.length;
        int minLen = len + 1;
        while (fast < len) {
            sum += nums[fast];
            fast++;
            while (slow < fast && sum >= s) {
                minLen = Math.min(minLen, fast - slow);
                sum -= nums[slow];
                slow++;
            }
        }
        if (minLen > len) return 0;
        return minLen;
    }
}
