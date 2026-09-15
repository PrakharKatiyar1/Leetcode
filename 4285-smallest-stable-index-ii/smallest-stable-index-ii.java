class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int ans = Integer.MAX_VALUE;
        int[] suffix = new int[nums.length];
        suffix[nums.length - 1] = nums[nums.length - 1];
         for(int i = nums.length - 2; i >= 0; i--){
            suffix[i] = Math.min(suffix[i + 1], nums[i]);
        }
        for(int i = 0; i < nums.length; i++){
            max = Math.max(max, nums[i]);
            int min = suffix[i];
            if(max - min < ans){
                ans = max - min;
                if(ans <= k) return i;
            }
        }
        return -1;
    }
}