class Solution {
    private List<List<Integer>> result = new ArrayList<List<Integer>>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        if(nums.length==0) return null;
		
        traverse(nums,new ArrayList<Integer>(),0, target);
		return result;
    }

	private void traverse(int[] nums,ArrayList<Integer> cur, int index, int target)
	{
		if(target==0)
		{
			result.add(new ArrayList(cur));
			return;
		}
		if(target<0 || index >=nums.length) return;
		
		cur.add(nums[index]);
		traverse(nums,cur,index,target-nums[index]);

		cur.remove(cur.size()-1);
		traverse(nums,cur,index+1,target);
		
	}
}
