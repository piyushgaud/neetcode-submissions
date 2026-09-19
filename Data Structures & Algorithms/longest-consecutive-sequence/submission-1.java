class Solution {
    public int longestConsecutive(int[] nums) {
        TreeSet<Integer>set = new TreeSet<Integer>();
        HashMap<Integer,Integer>map = new HashMap();
        if(nums.length==0)return 0;
        for(int i=0;i<nums.length;i++)
        {
        	set.add(nums[i]);
        }
        int max = 1;
        int range = set.first();
        int prev = 0;
        int i=set.first();
        while(!set.isEmpty())
        {
        	
        	if(i+1==set.first())
        	{        		
        		max++;
        		i++;
        	}else{
        		prev = Math.max(max, prev);
        		i=set.first();
        		max=1;
        	}
            set.pollFirst();
        }
		return Math.max(max, prev);
    }
}
