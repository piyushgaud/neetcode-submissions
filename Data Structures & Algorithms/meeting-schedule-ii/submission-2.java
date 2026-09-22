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
    public int minMeetingRooms(List<Interval> intervals) {
            int count = 0;
            if(intervals.size()==0)return count;
            intervals.sort((a,b)->Integer.compare(a.start,b.start));
            PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

            for(Interval interval:intervals)
            {
                if(!queue.isEmpty() && queue.peek()<=interval.start)
                {
                    queue.poll();
                }
                queue.offer(interval.end);
            }
            return queue.size();
    }
}
