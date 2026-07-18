class Solution {
    public int land(int[][] grid){
        int count = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j] == 1) count++;
            }
        }
        return count;
    }
    public int adjacent(int[][] grid){
        int count = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){

                if(grid[i][j] == 1){

                    if(i + 1 < grid.length && grid[i + 1][j] == 1)
                        count++;

                    if(j + 1 < grid[0].length && grid[i][j + 1] == 1)
                        count++;
                }
            }
        }

        return count;
    }
    public int islandPerimeter(int[][] grid) {
        return 4*land(grid) - 2*adjacent(grid);
    }
}