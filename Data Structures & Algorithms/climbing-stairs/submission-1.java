class Solution {
    int[]cache;
    public int climbStairs(int n) {
        if(n<=0) return 0;
        int one = 1, two = 1;
        for(int i=0;i<n-1; i++)
        {
            int tmp = one;
            one = one+two;
            two = tmp;
        }
        return one;
    }

    
}
