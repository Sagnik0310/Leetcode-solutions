class Solution {
    public double averageWaitingTime(int[][] customers) {

        long currentTime = 0;
        long totalWait = 0;

        for(int i = 0; i < customers.length; i++){

            currentTime = Math.max(currentTime, customers[i][0]);

            currentTime += customers[i][1];

            totalWait += currentTime - customers[i][0];
        }

        return (double) totalWait / customers.length;
    }
}