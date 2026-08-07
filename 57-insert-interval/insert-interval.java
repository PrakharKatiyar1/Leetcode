class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int start = newInterval[0];
        int end = newInterval[1];
        List<int[]> ls = new ArrayList<>();
        int i = 0;
        while (i < n && intervals[i][1] < start) {
            ls.add(new int[] { intervals[i][0], intervals[i][1] });
            i++;
        }
        while (i < n && intervals[i][0] <= end) {
            start = Math.min(intervals[i][0], start);
            end = Math.max(intervals[i][1], end);
            i++;
        }
        ls.add(new int[]{start, end});
        while(i < n){
            ls.add(intervals[i]);
            i++;
        }
        int[][] ans = new int[ls.size()][2];
        for (i = 0; i < ls.size(); i++) {
            ans[i][0] = ls.get(i)[0];
            ans[i][1] = ls.get(i)[1];
        }
        return ans;
    }
}