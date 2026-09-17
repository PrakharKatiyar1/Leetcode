class Solution {
    String ans = "";
    public String longestPalindrome(String s) {
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                if(isPalindrome(i, j, s)){
                    if(ans.length() < j - i + 1){
                        ans = s.substring(i, j + 1);
                    }
                }
            }
        }
        return ans;
    }
    boolean isPalindrome(int i, int j, String s){
        while(i <= j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}