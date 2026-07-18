class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int x = nums[0], y = nums[nums.length - 1];
        int ans = 0;
        for(int i = 1; i <= x; i++){
            if(x % i == 0 &&  y % i == 0){
                ans = i;
            }
        }
        return ans;
    }
}