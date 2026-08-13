class Solution {
    public String longestPalindrome(String s) {
        int l = 0;
        int r = 1;
        int a = 0;
        String ans = "";
        while (l < s.length()) {
            if(r > s.length()){
                l++;
                r = l + 1;
                continue;
            }
            if(palindrome(s.substring(l, r))) {
                int count = r - l ;
                if (a < count) {
                    a = count;
                    ans = s.substring(l, r);
                }
            }
            r++;
            if(r > s.length()){
                l++;
                r = l + 1;
            }
        }
        return ans;
    }

    public boolean palindrome(String a) {
        int l = 0, r = a.length() - 1;
        while (l <= r) {
            if (a.charAt(l) == (a.charAt(r))) {
                l++;
                r--;
                continue;
            } else
                return false;
        }
        return true;
    }
}