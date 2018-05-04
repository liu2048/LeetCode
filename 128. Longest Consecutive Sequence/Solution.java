class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int global = 0;
        for (int num : nums) {
           set.add(num); 
        }            
        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
                int left = num-1;
                int right = num+1;
                while (set.contains(left)) {
                    set.remove(left);
                    left--;
                }
                while (set.contains(right)) {
                    set.remove(right);
                    right++;
                }
                int local = right - left - 1;
                global = Math.max(global, local);
                    
            }
        }
        return global;
    }
}
