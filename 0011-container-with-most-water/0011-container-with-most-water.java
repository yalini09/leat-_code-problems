class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int cWidth = right - left;
            int cHeight = Math.min(height[left], height[right]);
            int cArea = cWidth * cHeight;

            maxArea = Math.max(maxArea, cArea);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}