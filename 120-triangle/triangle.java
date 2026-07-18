class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];
        for(int r = triangle.size()-1;r>=0;r--){
            for(int i = 0;i<triangle.get(r).size();i++){
                if(r == triangle.size()-1){
                    dp[r][i] = triangle.get(r).get(i);
                }
                else{
                    dp[r][i] = triangle.get(r).get(i) + Math.min(dp[r+1][i],dp[r+1][i+1]);
                }
            }
        }
        return dp[0][0];
    }
}