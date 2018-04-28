/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> rst = new LinkedList<>();
        if (intervals == null || intervals.size() == 0 ) return rst;
        Collections.sort(intervals, new myComparator());
        Interval first_interval = intervals.get(0);
        int start = first_interval.start;
        int end = first_interval.end;
        for (Interval interval : intervals){
            if (interval.start > end){
                rst.add(new Interval(start, end));
                start = interval.start;
                end = interval.end;
            }
            else end = Math.max(end, interval.end);
        }
        rst.add(new Interval(start, end));
        return rst;
    }
    
    private class myComparator implements Comparator<Interval>{
        @Override
        public int compare(Interval a , Interval b){
            return a.start - b.start;
        }
    }
    
}