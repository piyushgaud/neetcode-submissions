class Solution {
    public boolean isPalindrome(String s) {
        char[] ch = s.trim().toLowerCase().toCharArray();
		ArrayDeque<Character>queue = new ArrayDeque();
		ArrayDeque<Character>rqueue = new ArrayDeque();
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isLetterOrDigit(ch[i]))// && ch[i] != ' '
			{
				queue.offerFirst(ch[i]);
				rqueue.offerLast(ch[i]);
			}
		}
		while(!queue.isEmpty())
		{
			if(queue.peekFirst()!=rqueue.peekFirst())
			{
				return false;
			}
			queue.pollFirst();
			rqueue.pollFirst();
		}
		return true;
    }
}
