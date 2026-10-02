class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        String st = "";
        solve(n,0, 0, st, ans);
        return ans;
    }
    public void solve(int n, int open, int close, String st, List<String> ans){
        if(open == close && open == n){
            ans.add(new String(st));
            return;
        }
        if(open < n){
            solve(n, open + 1, close, st + "(", ans);
        }
        if(close < open){
            solve(n, open, close + 1, st + ")", ans);
        }
    }
}