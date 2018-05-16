class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new LinkedList<>();
        int len = nums.length;
        int begin = 0;
        int end = 0;
        while (begin < len && end < len) {
            while (end < len && (end-begin) == (nums[end] - nums[begin])) {
                end++;
            }
            end--;
            StringBuilder sb = new StringBuilder();
            if (begin == end) {
                sb.append(nums[begin]);                
            } else { 
                sb.append(nums[begin]).append("->").append(nums[end]);                
            }
            list.add(sb.toString());
            begin = end+1;
            end++;
        }
        return list;
    }
}
