class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ls = new ArrayList<>();
        String ans = "";
        generate(n, 0, 0, ans, ls);
        return ls;
    }
    static void generate(int n, int open, int close, String ans, List<String> ls){
        if(open == n && close == n) {
            ls.add(ans);
            return;
        }
        if(open < n){
            generate(n, open + 1, close, ans + '(', ls);
        }
        if(close < open){
            generate(n, open, close + 1, ans + ')', ls);
        }
    }
}