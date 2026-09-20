class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> result = new ArrayList<int[]>();
        Arrays.sort(intervals,new Comparator<int[]>(){
            public int compare(int[]a,int[]b)
            {
                return a[0]-b[0];
            }
        });
        int []inter = new int[2];
        inter = intervals[0];
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0]<=inter[1])
            {
                inter[0] = Math.min(intervals[i][0],inter[0]);
                inter[1] = Math.max(intervals[i][1],inter[1]);
            }else{
                result.add(new int[]{inter[0],inter[1]});
                inter = intervals[i];
            }
        }
        result.add(new int[]{inter[0],inter[1]});
        return result.toArray(new int[result.size()][]);
    }
}
