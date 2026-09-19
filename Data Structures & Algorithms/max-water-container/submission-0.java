class Solution {
    public int maxArea(int[] heights) {
        int len = heights.length;
        int left = 0;
        int right = len-1;
        int max = 0;
        while(left<right)
        {
        	max = Math.max(Math.min(heights[left],heights[right])*(right-left),max);
        	if(heights[left]<heights[right])left++;
        	else right --;
        }        
		return max;
    }
}
