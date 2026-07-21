class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int[] diff = new int[gas.length];
        int g = 0, c = 0;
        for(int i = 0; i < gas.length; i++){
            diff[i] = gas[i] - cost[i];
            g += gas[i];
            c += cost[i];
        }
        if(c > g) return -1;
        int tank = 0;
        int st = 0;
        for(int i = 0; i < gas.length; i++){
            tank += diff[i];
            if(tank < 0){
                st = i + 1;
                tank = 0;
            }
        }
        return st;
    }
}