class Solution {
    public int characterReplacement(String s, int k) {
      int[] hash = new int[26];
      int max = 0;
      int count = 0;
      int start = 0, maxLen = 0;
      for(int i = 0; i < s.length(); i++){
        hash[s.charAt(i) - 'A']++;
        max = Math.max(max,hash[s.charAt(i) - 'A']);
        int len = i - start + 1;
        if(len - max > k){
            hash[s.charAt(start) - 'A'] --;
            start++;
        }
        len = i - start + 1;
        maxLen = Math.max(maxLen, len);
      }  
      return maxLen;
    }
}
