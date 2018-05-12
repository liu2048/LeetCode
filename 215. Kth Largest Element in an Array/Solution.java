class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for(int n : nums) {
            p.add(n);
            if (p.size() > k) {
                p.poll();
            }
        }
        return p.poll();
    }
}
