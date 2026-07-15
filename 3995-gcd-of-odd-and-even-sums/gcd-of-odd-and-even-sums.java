class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd = n * n;
        int even = n * (n + 1);
        return gcd(odd, even);
    }
    public int gcd(int o, int e){
        int ans = 1;
        for(int i = 1; i <= Math.min(o, e); i++){
            if(o % i == 0 && e % i == 0){
                ans = i;
            }
        }
        return ans;
    }
}