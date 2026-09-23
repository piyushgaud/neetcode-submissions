class Solution {
    public int rob(int[] nums) {
        int prev1 = 0;
        int prev2 = 0;
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        for(int i=0;i<nums.length-1;i++)
        {
            int tmp = Math.max(prev1,prev2+nums[i]);
            prev2 = prev1;
            prev1 = tmp;
        }

        int prev1_1 = 0;
        int prev2_2 = 0;
        for(int i=1;i<nums.length;i++)
        {
            int tmp = Math.max(prev1_1,prev2_2+nums[i]);
            prev2_2 = prev1_1;
            prev1_1 = tmp;
        }

        return Math.max(prev1,prev1_1);
    }
}
