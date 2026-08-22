class Solution {
    public boolean recursion(char[][] board, String word, int row, int col,int curr,boolean[][] used){
        if(row < 0 || row >= board.length || col < 0 || col >= board[0].length) {
            return false;
        }
        if(used[row][col]){
            return false;
        }
        if(board[row][col] != word.charAt(curr)){
            return false;
        }
        if(curr == word.length()-1){
            return true;
        }
        used[row][col] = true;
        if(recursion(board, word, row+1, col, curr+1, used))    return true;

        if(recursion(board, word, row-1, col, curr+1, used))    return true;

        if(recursion(board, word, row, col+1, curr+1, used))    return true;

        if(recursion(board, word, row, col-1, curr+1, used))    return true;

        used[row][col] = false;
        return false;
    }
    public boolean exist(char[][] board, String word) {
        boolean[][] used = new boolean[board.length][board[0].length];
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(board[i][j] == word.charAt(0)){
                    if(recursion(board, word, i, j, 0, used)){
                        return true;
                    }
                    
                }
            }
        }
        return false;
    }
}