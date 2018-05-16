public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] rst = new int[]{-1, -1}; 
        if (nums == null || nums.length < 2) return rst;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int cur = nums[i];
            int diff = target - cur;
            if (map.containsKey(diff)){
                rst[0] = map.get(diff);
                rst[1] = i;
                return rst;
            } else {
                map.put(cur, i);                
            } 
        }
        return rst;
    }
}
