class Solution {
    public int[][] transpose(int[][] matrix) {
        int n = matrix.length;
       int m = matrix[0].length;
        
        
        // make new matrix of m X n 
        int res[][] = new int[m][n];
        
     //   int temp = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ;j++){
                
                // res[m][n] = matrix[n][m]
                res[j][i] = matrix[i][j];
        
            }
        }
        
        return res;
    }
}

