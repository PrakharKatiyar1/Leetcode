import java.util.Arrays;

class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        Arrays.sort(trips, (a, b) -> Integer.compare(a[1], b[1]));
        
        for (int i = 0; i < trips.length; i++) {
            int startI = trips[i][1];
            int endI = trips[i][2];
            for (int time = startI; time < endI; time++) {
                int passengersAtThisTime = trips[i][0];
                
                for (int j = 0; j < trips.length; j++) {
                    if (i == j) continue;
                    if (trips[j][1] <= time && time < trips[j][2]) {
                        passengersAtThisTime += trips[j][0];
                    }
                }
                
                if (passengersAtThisTime > capacity) {
                    return false;
                }
            }
        }
        return true;
    }
}