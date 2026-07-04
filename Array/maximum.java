class Solution {
    public int maxProduct(int[] nums) {
        int l = 1;
        int r = 1;
        int max = Integer.MIN_VALUE;
        for(int i = 0;  i < nums.length; i++){
            if(l == 0) l = 1;
            if(r == 0) r = 1;
            l *= nums[i];
            r *= nums[nums.length - 1 - i];
            max = Math.max(max, Math.max(l, r));
        }
        return max;
    }
}