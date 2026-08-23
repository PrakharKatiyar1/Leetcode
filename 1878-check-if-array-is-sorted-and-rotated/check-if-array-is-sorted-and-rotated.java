class Solution {
    public boolean check(int[] nums) {
        int breaks = 0;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] > nums[i + 1]) breaks++;
        }
        if(nums[nums.length - 1] > nums[0]) breaks++; 
        return breaks <= 1;
    }
}