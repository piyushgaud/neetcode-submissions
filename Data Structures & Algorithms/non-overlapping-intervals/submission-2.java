class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count = 0;
        
        Arrays.sort(intervals,new Comparator<int[]>(){
        	public int compare(int []a,int []b)
        	{
        		return a[1]-b[1];
        	}
        });
        int []inter = intervals[0];
        for(int i=1;i<intervals.length; i++)
        {
        	if(intervals[i][0]<inter[1])
        	{
        		count++;        		
        	}
        	else{
        		inter = intervals[i];
        	}
        }
		return count;
    }
}
