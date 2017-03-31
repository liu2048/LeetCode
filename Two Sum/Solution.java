public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] rst = {-1, -1};
        if (nums == null || nums.length < 2) return rst;
        Map<Integer, Integer> map = new HashMap<>(); // key is num[index], value is index;
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(target - nums[i])){
                rst[0] = map.get(target - nums[i]);
                rst[1] = i;
                return rst;
            }
            map.put(nums[i], i);
        }
        return rst;
    }
}