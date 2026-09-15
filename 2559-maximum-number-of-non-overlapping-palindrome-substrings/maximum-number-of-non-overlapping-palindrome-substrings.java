class Solution {
    public int maxPalindromes(String s, int k) {
        int count = 0;
        int i = 0;
        while(i <= s.length() - k){
            if(solve(s, i, i + k - 1)){
                i = i + k;
                count++;
            }
            else if(i + k < s.length() && solve(s, i, i + k)){
                i = i + k + 1;
                count++;
            }
            else i++;
        }
        return count;
    }
    public boolean solve(String s, int l, int r){
        while(l <= r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}