class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
		
		HashMap<Integer,Integer>map = new HashMap();
		
		for(int i:nums)
		{
			map.put(i,map.getOrDefault(i,0)+1);
		}				
		PriorityQueue<Integer>queue = new PriorityQueue<Integer>(
				new Comparator<Integer>()
				{
					public int compare(Integer a,Integer b)
					{
						return map.get(a)-map.get(b);						
					}
				});
		
		for(Integer n:map.keySet())
		{
			queue.offer(n);
			if(queue.size()>k){
				queue.poll();
			}
		}
		int i=0;
		int result[] = new int[queue.size()];
		while(!queue.isEmpty())
		{
			result[i]=queue.poll();
			i++;
		}
		return result;
	}
}
