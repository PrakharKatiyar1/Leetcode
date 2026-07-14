class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][]arr = new int[position.length][2];
        for(int i = 0; i < position.length; i++){
            arr[i][0] = position[i];
            arr[i][1] = speed[i];
        }
        Arrays.sort(arr, (a,b) -> Integer.compare(b[0], a[0]));
        double[] aa = new double[position.length];
        for(int i = 0; i < position.length; i++){
            aa[i] = (double)(target - arr[i][0]) / arr[i][1]; 
        }
        int fleet = 0;
        Stack <Double> st = new Stack <>();
        for(int i = 0; i < aa.length; i++){
            if(!st.isEmpty() && st.peek() >= aa[i]){
                continue;
            }
            else{
                st.push(aa[i]);
                fleet++;
            }
        }
        return fleet;
    }
}