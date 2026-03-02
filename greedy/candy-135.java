class Solution {
    public int candy(int[] ratings) {
        int[] sol = new int [ratings.length];
        Arrays.fill(sol, 1);
        for(int i = 1; i < ratings.length; i++){
            if(ratings[i] > ratings[i - 1])
            sol[i] = sol[i - 1] + 1;
        }
        for(int i = ratings.length - 2; i >= 0; i--){
            if(ratings[i] > ratings[i + 1]){
                sol[i] = Math.max(sol[i], sol[i + 1] + 1);
            }
        }
        int sum = 0;
        for(int i = 0; i < ratings.length; i++){
            sum += sol[i];
        }
        return sum;
    }
}