class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hs = new HashMap<>();
        for(int i = 0; i < magazine.length(); i++){
            hs.put(magazine.charAt(i), hs.getOrDefault(magazine.charAt(i), 0) + 1);
        }
        for(int i = 0; i < ransomNote.length(); i++){
            char c = ransomNote.charAt(i);
            if(hs.containsKey(c) && hs.get(c) > 0){
                hs.put(c, hs.get(c) - 1);
            }
            else{
                return false;
            }
        }
        return true;

    }
}