class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hash = new int[256];
        int count = 0;
        int sIndex = 0, max = 0;
        for(int i = 0; i < s.length(); i++){
            while(hash[s.charAt(i)] > 0){
                hash[s.charAt(sIndex)]--;
                count--;
                sIndex++;
            }
            hash[s.charAt(i)]++;
            count++;
            max = Math.max(max, count);
        }
        return max;
    }
}
