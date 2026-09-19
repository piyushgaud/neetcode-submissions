class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap();
        for(int i:nums)
        {
            if(null != map.get(i) && i==map.get(i))
            {
                return true;
            }
            map.put(i,i);
        }

        return false;
    }
}