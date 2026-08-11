class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        int ans = 0;
        for (int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }
        int l = 1, r = max;
        while (l <= r) {
            int count = 0;
            int mid = l + (r - l) / 2;
            for(int i = 0; i < piles.length; i++){
                count += Math.ceil((double)piles[i] / mid);
            }
            if(count <= h){
                r = mid - 1;
                ans = mid;
            }
            else{
                l = mid + 1;
            }
        }
        return ans;
    }
}