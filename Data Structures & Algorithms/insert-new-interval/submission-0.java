class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]>result = new ArrayList<int[]>();

        int i=0;
        int n=intervals.length;

        while(i<n && intervals[i][1]<newInterval[0])
        {
            result.add(intervals[i]);
            i++;
        }

        while(i<n && intervals[i][0]<=newInterval[1])
        {
            newInterval[0] = Math.min(intervals[i][0],newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1],newInterval[1]);
            i++;
        }
        result.add(newInterval);

        while(i<n)
        {
            result.add(intervals[i]);
            i++;
        }

        // Convert List<int[]> to int[][]

    int[][] answer = new int[result.size()][2];


    for (int j = 0; j < result.size(); j++) {

    answer[j] = result.get(j);

    }

        return answer;
    }
}
