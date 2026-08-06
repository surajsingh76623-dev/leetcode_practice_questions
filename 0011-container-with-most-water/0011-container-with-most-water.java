class Solution {
    public int maxArea(int[] h) {

        int area = 0;
        int l = 0;
        int r = h.length - 1;

        while (l < r) {

            int currentArea = Math.min(h[l], h[r]) * (r - l);
            area = Math.max(area, currentArea);

            if (h[l] < h[r]) {
                l++;
            } else {
                r--;
            }
        }

        return area;
    }
}