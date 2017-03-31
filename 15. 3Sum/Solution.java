public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> rst = new LinkedList<>();
        int len = nums.length;
        if (len < 3) return rst;
        Arrays.sort(nums);
        for (int i = 0; i < len - 2; i++){
            int j = i + 1;
            int k = len - 1;
            while (j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0){
                    List<Integer> list = new LinkedList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    rst.add(list);
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (k > j && nums[k + 1] == nums[k]) k--;
                }
                else if (sum < 0) {
                    j++;
                    while (j < k && nums[j] == nums[j - 1]) j++;
                }
                else {
                    k--;
                    while (k > j && nums[k + 1] == nums[k]) k--;
                }
            }
            while (i < len - 3 && nums[i] == nums[i + 1]) i++;
        } 
        return rst;
    }
}