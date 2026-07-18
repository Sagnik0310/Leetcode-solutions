class Solution {
    public int hourSum(int[][] grid,int row,int col){
        int sum = 0;
        for(int i = 0;i<3;i++){
            sum = sum + grid[row][col+i];
            sum = sum + grid[row+2][col+i];
        }
        sum = sum + grid[row+1][col+1];
        return sum;
    }
    public int maxSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int max = 0;
        for(int i = 0;i<m-2;i++){
            for(int j = 0;j<n-2;j++){
                max = Math.max(max,hourSum(grid,i,j));
            }
        }
        return max;
    }
}