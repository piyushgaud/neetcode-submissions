class Solution {
    	public List<List<String>> groupAnagrams(String[] strs) {
		
		HashMap<String,ArrayList<String>>map = new HashMap<String,ArrayList<String>>();
		
		for(int i=0;i<strs.length;i++)
		{
			
			char[]ch = strs[i].toCharArray();
			Arrays.sort(ch);
			String sort = new String(ch);
			if(!map.containsKey(sort))
			{
				map.put(sort, new ArrayList());
			}
			
			map.get(sort).add(strs[i]);
		}
		
		return new ArrayList(map.values());
	}
}
