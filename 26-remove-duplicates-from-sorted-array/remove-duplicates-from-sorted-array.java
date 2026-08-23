class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            ls.add(nums[i]);
        }
        ArrayList<Integer> ls1 = new ArrayList<>();
        for(int i = 0; i < ls.size(); i++){
            if(!ls1.contains(ls.get(i))){
                ls1.add(ls.get(i));
            }
        }
        Arrays.fill(nums, 0);
        for(int i = 0; i < ls1.size(); i++){
            nums[i] = ls1.get(i);
        }
        return ls1.size();
    }
}