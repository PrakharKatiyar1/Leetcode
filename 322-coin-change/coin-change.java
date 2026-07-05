class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount +  1];
        if(amount < 1) return 0;
        for(int i = 1; i <= amount; i++){
            int min = Integer.MAX_VALUE;
            for(int coin : coins){
                if(coin <= i && dp[i - coin] != Integer.MAX_VALUE){
                    min = Math.min(min, 1 + dp[i - coin]);
                }
            }
            dp[i] = min;
        }
        if(dp[amount] == Integer.MAX_VALUE) return -1;
        return dp[amount];
    }
}