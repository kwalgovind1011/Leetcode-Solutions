class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right= height.length-1;
        int max_Area=0;
        while(left<right){
            int width=right-left;
            int current_height=Math.min(height[right], height[left]);
            max_Area=Math.max(max_Area, current_height*width);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max_Area;
    }
}