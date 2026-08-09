class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int m = triangle.get(n - 1).size();
        int[][] dp = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        dp[0][0] = triangle.get(0).get(0);
        for(int i = 1; i < n; i++){
            dp[i][0] = triangle.get(i).get(0) + dp[i - 1][0];
        }
        for(int i = 1; i < n; i++){
            for(int j = 1; j <= i; j++){
                if(i == j){
                    dp[i][j] = triangle.get(i).get(j) + dp[i -1][j - 1];

                }
                else dp[i][j] = triangle.get(i).get(j) + Math.min(dp[i- 1][j], dp[i -1][j - 1]);
            }
        }    
        int ans = Integer.MAX_VALUE;    
        for(int i = 0; i < m; i++){
            ans = Math.min(ans, dp[n - 1][i]);
        }
        return ans;
    }
}