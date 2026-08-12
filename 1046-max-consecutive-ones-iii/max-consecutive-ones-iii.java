class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (k > 0) {
                    k--;
                }
                else {
                    while (nums[l] != 0) {
                        l++;
                    }
                    l++;
                }
            }
            max = Math.max(max, i - l + 1);
        }
        return max;
    }
}