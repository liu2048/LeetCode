class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1;
        int index2 =  n - 1;
        int index = m+n-1;
        while (index1 > -1 && index2 > -1) {
            int x = nums1[index1];
            int y = nums2[index2];
            if (x > y) {
                nums1[index] = x;
                index1--;                
            } else {
                nums1[index] = y;
                index2--;
            }
            index--;
        }
        while (index1 > -1) {
            nums1[index--] = nums1[index1--];
        }
        while (index2>-1) {
            nums1[index--] = nums2[index2--];
        }
    }
}
