class Solution {
    public int maxArea(int[] height) {
        int i =0;
        int j = height.length-1;
        int water = 0;
        while(i<j){
            int h = Math.min(height[i], height[j]);
            int width = j-i;
            int area = h*width;
            water = Math.max(area, water);

            if (height[i]>height[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return water;
    }
}