class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayDeque<Character>queue = new ArrayDeque();        
        int size = 1;
        if(s.length()==0) return 0;
        int left = 0;
        int right = left+1;
        queue.offer(s.charAt(left));
        while(right<=s.length()-1 && left<right)
        {
            while(queue.contains(s.charAt(right)))
            {
                queue.pollFirst();                
                left++;
            }
            queue.offer(s.charAt(right));
            size = Math.max(size,queue.size());
            right++;
        }
        return size;
    }
}
