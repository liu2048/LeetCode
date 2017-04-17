public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> rst = new ArrayList<>();
        if (nums == null || nums.length == 0) return rst;
        rst.add(new LinkedList<>());
        
        Arrays.sort(nums);
        int last_size = 0;
        
        for (int i = 0; i < nums.length; i++){
            int size = rst.size();
            
            int start = 0;
            if (i > 0 && nums[i] == nums[i-1]) start = last_size;
            last_size = size;
            
            for (int j = start; j < size; j++){
                List<Integer> list = new LinkedList<>(rst.get(j));
                list.add(nums[i]);
                rst.add(list);
            }
        }
        return rst;
    }
}