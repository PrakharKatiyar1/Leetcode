class Solution {
    public void moveZeroes(int[] nums) {
        int count = nums.length - 1;
        for(int i = 0; i < count; i++){
            if(nums[i] == 0){
                for(int j = i; j < count; j++){
                    nums[j] = nums[j + 1];
                }
                nums[count--] = 0;
                i--; //if multiple consecutive zero
            }    
        }
    }
}