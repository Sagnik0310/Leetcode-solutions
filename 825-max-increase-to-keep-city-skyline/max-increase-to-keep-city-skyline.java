class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] rowMax = new int[grid.length];
        int[] colMax = new int[grid.length];
        int index = 0;
        for(int i = 0;i<grid.length;i++){
            int rmax = 0;
            int cmax = 0;
            for(int j = 0;j<grid.length;j++){
                rmax = Math.max(rmax,grid[i][j]);
                cmax = Math.max(cmax,grid[j][i]);
            }
            rowMax[index] = rmax;
            colMax[index] = cmax;
            index++;
        }
        int sum = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid.length;j++){
                int min = Math.min(rowMax[i],colMax[j]);
                sum = sum + min-grid[i][j];
            }
        }
        return sum;
    }
}