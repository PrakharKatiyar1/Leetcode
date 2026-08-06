class Solution {
    public int candy(int[] ratings) {
        int i = 1, sum = ratings.length;
        int n = ratings.length;
        while(i < n){
            int peak = 0, down = 0;
            if(ratings[i] == ratings[i - 1]){
                i++;
                continue;
            }
            while(i < n && ratings[i] > ratings[i - 1]){
                sum += peak + 1;
                peak++;
                i++;
            }
            while(i < n && ratings[i] < ratings[i - 1]){
                sum += down + 1;
                down++;
                i++;
            }
            sum -= Math.min(peak, down);
        }
        return sum;
    }
}