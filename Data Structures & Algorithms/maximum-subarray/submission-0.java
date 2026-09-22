class Solution {
    public int maxSubArray(int[] nums) {

        int maxSum = nums[0];
        int curSum = 0;
        for(int i:nums)
        {
            curSum+=i;
            curSum = Math.max(i,curSum);            
            maxSum = Math.max(curSum,maxSum);
        }
        return maxSum;
    }
}
