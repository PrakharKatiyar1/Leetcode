class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        int n = obstacleGrid.length;
        int n1 = obstacleGrid[0].length;
        for(int i = 0; i < n; i++){
            if(obstacleGrid[i][0] == 0){
                dp[i][0] = 1;
            }
            else{
                break;
            }
        }
        for(int i = 0; i < n1; i++){
            if(obstacleGrid[0][i] == 0){
                dp[0][i] = 1;
            }
            else{
                break;
            }
        }
        for(int i = 1; i < n; i++){
            for(int j = 1; j < n1; j++){
                if(obstacleGrid[i][j] == 1) dp[i][j] = 0;
                else dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[n - 1][n1 - 1];
    }
}