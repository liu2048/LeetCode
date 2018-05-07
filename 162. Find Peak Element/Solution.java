class Solution {
    public int findPeakElement(int[] nums) {
        int len = nums.length;
        if (len == 1) return 0;        
        if (nums[0] > nums[1]) return 0;        
        if (nums[len-1] > nums[len-2]) return len - 1;
        int i = 1;
        int j = nums.length - 2;
        while (i < j) {
            int left = nums[i];
            int right = nums[j];
            int m = i + (j - i) / 2;
            int mid = nums[m];
            if (left > nums[i-1] && left > nums[i+1]) {
                return i;
            } else if (right > nums[j-1] && right > nums[j+1]) {
                return j;
            } else if (mid > nums[m-1] && mid > nums[m+1]) {
                return m;
            }   
            if (left == mid) {
                j = m;
            } else if (right == mid) {
                i = m;           
            } else {
              i++;  
            }
        }
        return i;
    }
}
