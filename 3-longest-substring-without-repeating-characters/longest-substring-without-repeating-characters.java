class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> map = new HashSet<>();
        int left = 0;
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            char x = s.charAt(i);
            while(map.contains(x)){
                map.remove(s.charAt(left++));
            }
            map.add(x);
            max = Math.max(max, i - left + 1);

        }
        return max;
    }
}