class Solution {
    public int rob(int[] nums) {
        if(nums.length < 2) return nums[0];
        int[] dp1 = new int[nums.length - 1];
        int[] dp2 = new int[nums.length - 1];
        for(int i = 0; i < nums.length - 1; i++){
            dp1[i] = nums[i];
            dp2[i] = nums[i + 1];
        }
        int ans0 = solve(dp1);
        int ans1 = solve(dp2);
        return Math.max(ans0,  ans1);
    }
    public int solve(int[] ndp){
        if(ndp.length < 2) return ndp[0];
        int[] dp = new int[ndp.length];
        dp[0] = ndp[0];
        dp[1] = Math.max(ndp[0], ndp[1]);
        for(int i = 2; i < ndp.length; i++){
            dp[i] = Math.max(dp[i - 2] + ndp[i], dp[i - 1]);
        }
        return dp[ndp.length - 1];
    }
}