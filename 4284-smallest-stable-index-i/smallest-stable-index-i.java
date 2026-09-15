class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int ans = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            max = Math.max(max, nums[i]);
            int min = Integer.MAX_VALUE;
            for(int j = i; j < nums.length; j++){
                min = Math.min(min, nums[j]);
            }
            if(ans > max - min){
                ans = max - min;
                index = i;
                if(ans <= k)return i;
            }
        }
        return -1;
    }
}