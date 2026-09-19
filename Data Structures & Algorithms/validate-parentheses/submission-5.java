class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character>queue = new ArrayDeque();
        HashMap<Character,Character>map = new HashMap();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');
        if(s.length()%2!=0) return false;
        for(int i=0;i<s.length();i++)
        {
            
            	if(map.containsKey(s.charAt(i)))
            	{
            		if(queue.isEmpty() || queue.pop()!=map.get(s.charAt(i)))
    				{
    					return false;
    				}
            	}else{
            		queue.push(s.charAt(i));
            	}
        }
       
        if(queue.isEmpty()) return true;
        return false;
    }
}
