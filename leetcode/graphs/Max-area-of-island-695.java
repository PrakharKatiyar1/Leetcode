class Solution {
    int ans = 0, count  =0;
    public int maxAreaOfIsland(int[][] grid) { 
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                ans = 0;
                if(grid[i][j] == 1){
                    dfs(grid, i, j);
                    count = Math.max(count, ans);
                }
            }
        }
        return count;
    }
    private void dfs(int[][] grid, int i, int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) return;
        grid[i][j] = 0;
        ans++;
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }
}
