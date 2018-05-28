class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> pq = new PriorityQueue<>(k);
        for (int n : nums) {
            if (pq.size() < k) {
                pq.offer(n);
            } else {
                int top = pq.peek();
                if (n > top) {
                    pq.poll();
                    pq.offer(n);
                }
            }
        }
        return pq.peek();
    }
}

// class Solution {
//     public int findKthLargest(int[] nums, int k) {
//         Queue<Integer> pq = new PriorityQueue<>();
//         for (int n : nums) {
//             pq.offer(n);
//             if (pq.size() > k) {
//                 pq.poll();
//             }
//         }
//         return pq.peek();
//     }
// }
