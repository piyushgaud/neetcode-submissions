class Solution {
    public String minWindow(String s, String t) {
        if(s.length()==0 || t.length() == 0 || s.length()<t.length() ) return "";
		
		HashMap<Character, Integer>map = new HashMap<Character, Integer>();
		for(int i=0;i<t.length();i++)
		{
			char c = t.charAt(i);
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		int left = 0;
		int missing = t.length();
		int bestLen = Integer.MAX_VALUE;
		int bestIndex = 0;
		for(int right = 0;right<s.length();right++)
		{
			char c = s.charAt(right);
			if(map.containsKey(c))
			{
				if(map.get(c)>0)
				{
					missing--;
				}
				map.put(c, map.get(c)-1);
			}
			
			
			while(missing==0)//bestFit
			{
				char ch = s.charAt(left);
				if(right-left+1<bestLen)
				{
					bestLen = right-left+1;
					bestIndex = left;
				}
				if(map.containsKey(ch))
				{
					map.put(ch, map.get(ch)+1);
					if(map.get(ch)>0)
						{
						missing++;
						}
				}
				
				left++;
			}
			
		}
		if(bestLen == Integer.MAX_VALUE)return "";
		return s.substring(bestIndex,bestIndex+bestLen);
    }
}
