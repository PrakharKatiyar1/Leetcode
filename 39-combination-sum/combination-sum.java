class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        solve(candidates, 0, sub, ans, 0, target);
        return ans;
    }
    public void solve(int[]candidates, int index, List<Integer> sub, List<List<Integer>> ans, int sum, int target){
        if(sum == target){
            ans.add(new ArrayList<>(sub));
            return;
        }
        if(sum > target || index >= candidates.length){
            return;
        }
        solve(candidates, index + 1, sub,ans, sum, target);
        sub.add(candidates[index]);
        solve(candidates, index, sub, ans, sum + candidates[index], target);
        sub.remove(sub.size() - 1);
        return;
    }
}