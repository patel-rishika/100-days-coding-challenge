class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[] col = new int[c];
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                if (matrix[j][i] > max) 
                    max = matrix[j][i];
            }
            col[i] = max;
            max = Integer.MIN_VALUE;
        }
        
        int[][] answer = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                answer[i][j] = matrix[i][j];
            }
        }
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (answer[i][j] == -1) {
                    answer[i][j] = col[j];
                }
            }
        }
        
        return answer;
    }
}

