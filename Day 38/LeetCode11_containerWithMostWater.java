class Solution {
    public int maxArea(int[] height) {
        // in this question we will use two pointer approach;
        // first pointer will be pointing to left end and another will be pointer to right;
        
        int l = height.length;
        int left = 0;
        int right = l-1;
        int area = 0;
        while(left<right){
            int w = Math.min(height[left], height[right]);
            int h = right-left;
            area = Math.max(area, w*h);
            
            if(height[left]<height[right])
                left++;
            else
                right--;
        }
        
        return area;
    }
}
