class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int left = 0;
        HashSet<Integer>st = new HashSet<Integer>();
        for(int right = 0;right<nums.length;right++)
        {
        	if(st.contains(nums[right]))
        	{
        		return true;
        	}
        	st.add(nums[right]);
        	if(right-left>=k){
        		st.remove(nums[left]);
        		left++;
        	}
        }   

        return false;
    }
}