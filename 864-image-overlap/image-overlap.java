class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int ans = 0;
        int n = img1.length;
        for(int i = -n + 1; i < n; i++){
            for(int j = -n + 1; j < n; j++){
                int x = solve(img1, img2, i, j, n);
                ans = Math.max(ans, x);
            }
        }
        return ans; 
    }
    public int solve(int[][] img1, int[][] img2, int x, int y, int n){
        int zz = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int roff = i + x;
                int coff = j + y;
                if(roff < 0 || roff >= n || coff < 0 || coff >= n) continue;
                if(img1[i][j] == 1 && img2[roff][coff] == 1){
                    zz++;
                }
            }
        }
        return zz;
    }
}