public class Solution {
    public int maxArea(int[] height) {
        if (height == null) return 0;
        int len = height.length;
        if (len < 2) return 0;
        int maxarea = 0;
        int l = 0, r = len - 1;
        while (l < r){
            int curHeight = 0;
            int curWidth = r - l;
            if (height[l] < height[r]) {
                curHeight = height[l];
                l++;
            }
            else {
                curHeight = height[r];
                r--;
            }
            int curarea = curHeight * curWidth;
            maxarea = Math.max(maxarea, curarea);
        }
        return maxarea;
    }
}