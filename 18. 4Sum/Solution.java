public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> rst = new LinkedList<>();
        if (nums == null) return rst;
        int len = nums.length;
        if (len < 4) return rst;
        Arrays.sort(nums);
        for (int i = 0; i < len - 3; i++){
            if (i > 0 && nums[i] == nums[i-1]) continue;
            for (int j = i + 1; j < len - 2; j++){
                if (j > i + 1 && nums[j] == nums[j -1]) continue;
                int left = j + 1;
                int right = len - 1;
                while (left < right){
                    int a = nums[i], b = nums[j], c = nums[left], d = nums[right];
                    int sum = a + b + c + d;
                    if (sum == target){
                        List<Integer> list = new LinkedList<>();
                        list.add(a);
                        list.add(b);
                        list.add(c);
                        list.add(d);
                        rst.add(list);
                        left++;
                        right--;
                        while (left < right && nums[left] == nums[left - 1]) left++;
                        while (left < right && nums[right] == nums[right + 1]) right--;
                    }
                    else if (sum > target){
                        right--;
                        while (left < right && nums[right] == nums[right+1]) right--;
                    }
                    else{
                        left++;
                        while (left < right && nums[left] == nums[left-1]) left++;
                    }
                }
            }
        }
        return rst;
    }
}