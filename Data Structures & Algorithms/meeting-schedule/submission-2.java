/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        if(intervals.size()==0) return true;

        intervals.sort(new Comparator<Interval>()
        {
                public int compare(Interval a, Interval b)
                {
                    return a.start-b.start;
                }
        }
        );

        Interval interval = intervals.get(0);
        for(int i=1;i<intervals.size();i++)
        {
            if(interval.end>intervals.get(i).start)
            {
                return false;
            }
            interval = intervals.get(i);
        }
        return true;
    }
}
