class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int left = 0;
        int right = left+1;
        if(prices.length<=1)return max;
        while(left<right)
        {
            if(prices[left]>prices[right])
            {
                left++;             
            }else{
                max = Math.max(max,prices[right]-prices[left]);
            }
            if(right<prices.length-1)right++;
            else left++;
        }
        return max;
    }
}
