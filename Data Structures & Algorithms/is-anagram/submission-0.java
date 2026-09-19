class Solution {
    public boolean isAnagram(String s, String t) {
         HashMap<Character,Integer>sMap = new HashMap();
	        HashMap<Character,Integer>tMap = new HashMap();
	        if(s.length()!=t.length())
	        {
	        	return false;
	        }
	        for(char c:s.toCharArray())
	        {
	        	sMap.put(c,sMap.getOrDefault(c, 1)+1);
	        }
	        for(char ct:t.toCharArray())
	        {
	        	tMap.put(ct, tMap.getOrDefault(ct, 1)+1);
	        }
	        if(sMap.equals(tMap)) return true;
	        
	        return false;


    }
}
