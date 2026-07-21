class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < s.length(); ){
            int si = i;
            int ei = s.lastIndexOf(s.charAt(i));
            for(int j = si; j < ei; j++){
                if(s.lastIndexOf(s.charAt(j)) > ei){
                    ei = s.lastIndexOf(s.charAt(j));
                }
            }
            ans.add(ei - si + 1);
            i = ei + 1;
        }
        return ans;
    }
}