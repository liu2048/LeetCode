class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (map.containsKey(n)) {
                int j = map.get(n);
                int diff = i - j;
                if (diff <= k) {
                    return true;
                }                
            }
            map.put(n, i);            
        }
        return false;        
    }
}
