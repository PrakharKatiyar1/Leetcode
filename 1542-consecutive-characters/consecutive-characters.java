class Solution {
    public int maxPower(String s) {
        int l = 0, r = 0;
        int max = 0;
        while(l <= r && r < s.length()){
            if(r < s.length() && s.charAt(l) == s.charAt(r)){
                max = Math.max(max, r - l + 1);             
                r++;
            }
            else{
                l++;
            }
        }
        return max;
    }
}