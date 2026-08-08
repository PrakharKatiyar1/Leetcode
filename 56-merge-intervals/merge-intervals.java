class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        List<int[]> ls = new ArrayList<>();
        int i = 1;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int start = intervals[0][0], end = intervals[0][1];
        for (i = 1; i < n; i++) {
            if(intervals[i][0] <= end) {
                end = Math.max(end, intervals[i][1]);
            }
            else{
                ls.add(new int[]{start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        ls.add(new int[] { start, end });
        int[][] ans = new int[ls.size()][2];
        for (i = 0; i < ls.size(); i++) {
            ans[i][0] = ls.get(i)[0];
            ans[i][1] = ls.get(i)[1];
        }
        return ans;
    }
}