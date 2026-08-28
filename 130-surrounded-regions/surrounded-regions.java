class Solution {
    public void dfs(char[][] board, int row, int col){
        if(row < 0 || row >= board.length || col >= board[0].length || col < 0){
            return;
        }
        if(board[row][col] != 'O'){
            return;
        }
        board[row][col] = 'S';
        dfs(board,row+1,col);
        dfs(board,row-1,col);
        dfs(board,row,col+1);
        dfs(board,row,col-1);
    }
    public void solve(char[][] board) {
        for(int j = 0;j<board[0].length;j++){
            dfs(board,0,j);
            dfs(board,board.length-1,j);
        }
        for(int i = 0;i<board.length;i++){
            dfs(board,i,0);
            dfs(board,i,board[0].length-1);
        }
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(board[i][j] == 'S'){
                    board[i][j] = 'O';
                }
                else{
                    board[i][j] = 'X';
                }
            }
        }
    }
}