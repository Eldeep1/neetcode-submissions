class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        double[][] cars = new double[n][2];
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = (double) (target - position[i]) / speed[i];
        }
        Arrays.sort(cars, (a, b) -> Double.compare(a[0], b[0]));

        int fleetCount = 1;
        int pointer = n - 1;

        for (int i = n - 2; i >= 0; i--) {
            if (cars[i][1] > cars[pointer][1]) {
                pointer = i;
                fleetCount++;
            }
        }
        return fleetCount;
    }
}