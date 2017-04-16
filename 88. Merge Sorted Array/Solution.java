public class Solution {
	// merge from tail
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index_1 = m - 1;
        int index_2 = n - 1;
        int index = m + n - 1;
        while (index_1 >= 0 && index_2 >= 0){
            if (nums1[index_1] > nums2[index_2]) {
                nums1[index--] = nums1[index_1--];
            }
            else {
                nums1[index--] = nums2[index_2--];
            }
        } 
        while (index_1 >= 0) {
            nums1[index--] = nums1[index_1--];
        }
        while (index_2 >= 0) {
            nums1[index--] = nums2[index_2--];
        }
    }
}