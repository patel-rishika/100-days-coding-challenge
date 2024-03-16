class Solution {
    public int minPathSum(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] dp = new int[rows][cols];
        
        // Initialize the bottom-right cell of dp
        dp[rows - 1][cols - 1] = grid[rows - 1][cols - 1];
        
        // Fill the last row of dp
        for (int j = cols - 2; j >= 0; j--) {
            dp[rows - 1][j] = grid[rows - 1][j] + dp[rows - 1][j + 1];
        }
        
        // Fill the last column of dp
        for (int i = rows - 2; i >= 0; i--) {
            dp[i][cols - 1] = grid[i][cols - 1] + dp[i + 1][cols - 1];
        }
        
        // Fill the rest of the dp table
        for (int i = rows - 2; i >= 0; i--) {
            for (int j = cols - 2; j >= 0; j--) {
                dp[i][j] = grid[i][j] + Math.min(dp[i + 1][j], dp[i][j + 1]);
            }
        }
        
        return dp[0][0];
    }
}

