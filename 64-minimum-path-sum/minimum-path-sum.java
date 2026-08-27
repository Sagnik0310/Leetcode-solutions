class Solution {
    public int backtrack(int[][] grid, int[][] dp, int i, int j) {

        if(i == grid.length - 1 && j == grid[0].length - 1) {
            return grid[i][j];
        }

        if(dp[i][j] != -1) {
            return dp[i][j];
        }

        int right = Integer.MAX_VALUE;
        int down = Integer.MAX_VALUE;

        if(j < grid[0].length - 1) {
            right = backtrack(grid, dp, i, j + 1);
        }

        if(i < grid.length - 1) {
            down = backtrack(grid, dp, i + 1, j);
        }

        dp[i][j] = grid[i][j] + Math.min(right, down);

        return dp[i][j];
    }
    public int minPathSum(int[][] grid) {
       int n = grid.length;
        int m = grid[0].length;

        int[][] dp = new int[n][m];

        for(int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return backtrack(grid, dp, 0, 0);
    }
}