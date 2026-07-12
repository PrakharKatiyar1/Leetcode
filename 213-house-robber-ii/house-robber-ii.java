class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);
        int n = nums.length;
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        int x = solve(nums,dp1, 0, n - 2);
        int y = solve(nums, dp2, 1, n - 1);
        return Math.max(x, y);
    }
    int solve(int[] nums, int[]dp,int i, int end){
        dp[i] = nums[i];
        dp[i + 1] = Math.max(nums[i + 1], nums[i]);
        for(int j = i + 2; j <= end; j++){
            dp[j] = Math.max(nums[j] + dp[j - 2], dp[j - 1]);
        }
        return dp[end];
    }
}